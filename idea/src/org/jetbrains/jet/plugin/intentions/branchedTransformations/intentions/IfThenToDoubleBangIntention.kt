/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.intentions.branchedTransformations.intentions

import org.jetbrains.jet.plugin.intentions.JetSelfTargetingIntention
import com.intellij.openapi.editor.Editor
import org.jetbrains.jet.lang.psi.JetIfExpression
import org.jetbrains.jet.lang.psi.JetBinaryExpression
import org.jetbrains.jet.lexer.JetTokens
import org.jetbrains.jet.plugin.intentions.branchedTransformations.evaluatesTo
import org.jetbrains.jet.plugin.intentions.branchedTransformations.comparesNonNullToNull
import org.jetbrains.jet.plugin.intentions.branchedTransformations.getNonNullExpression
import org.jetbrains.jet.plugin.intentions.branchedTransformations.replace
import org.jetbrains.jet.plugin.intentions.branchedTransformations.isStableVariable
import org.jetbrains.jet.plugin.intentions.branchedTransformations.isThrowExpression
import org.jetbrains.jet.lang.psi.JetPostfixExpression
import org.jetbrains.jet.plugin.intentions.branchedTransformations.inlineBaseExpressionIfApplicableWithPrompt
import org.jetbrains.jet.plugin.intentions.branchedTransformations.extractExpressionIfSingle
import org.jetbrains.jet.lang.psi.JetThrowExpression
import org.jetbrains.jet.lang.psi.JetCallExpression
import org.jetbrains.jet.plugin.JetBundle

public class IfThenToDoubleBangIntention : JetSelfTargetingIntention<JetIfExpression>("if.then.to.double.bang", javaClass()) {

    override fun isApplicableTo(element: JetIfExpression): Boolean {
        val condition = element.getCondition()
        val thenClause = element.getThen()
        val elseClause = element.getElse()
        if (thenClause == null || elseClause == null || condition !is JetBinaryExpression || !condition.comparesNonNullToNull()) return false

        val expression = condition.getNonNullExpression()

        if (expression == null || !expression.isStableVariable()) return false

        val token = condition.getOperationToken()

        val thrown = when {
            token == JetTokens.EQEQ && thenClause.isThrowExpression() -> thenClause.extractExpressionIfSingle() as JetThrowExpression
            token == JetTokens.EXCLEQ && elseClause.isThrowExpression() -> elseClause.extractExpressionIfSingle() as JetThrowExpression
            else -> null
        }?.getThrownExpression() as? JetCallExpression

        val expressionMatches = when (token) {
            JetTokens.EQEQ -> elseClause.evaluatesTo(expression)
            JetTokens.EXCLEQ -> thenClause.evaluatesTo(expression)
            else -> false
        }
        if (thrown != null && expressionMatches) {
            val exceptionName = thrown.getCalleeExpression()?.getText()
            if ((exceptionName != "NullPointerException" && exceptionName != "KotlinNullPointerException") || !thrown.getValueArguments().isEmpty()) {
                // Warn that custom exception will be overwritten by intention action
                setText(JetBundle.message("if.then.to.double.bang.replace.exception"))
            }
            return true
        }
        else {
            return false
        }

    }

    override fun applyTo(element: JetIfExpression, editor: Editor) {
        val condition = element.getCondition() as JetBinaryExpression

        val expression = checkNotNull(condition.getNonNullExpression(), "condition must contain non null expression")
        val resultingExprString = expression.getText() + "!!"
        val result = element.replace(resultingExprString) as JetPostfixExpression

        result.inlineBaseExpressionIfApplicableWithPrompt(editor)
    }
}
