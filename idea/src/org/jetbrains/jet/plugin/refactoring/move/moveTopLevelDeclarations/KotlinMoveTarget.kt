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

package org.jetbrains.jet.plugin.refactoring.move.moveTopLevelDeclarations

import com.intellij.refactoring.PackageWrapper
import com.intellij.refactoring.MoveDestination
import org.jetbrains.jet.lang.psi.JetFile
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiManager

public trait KotlinMoveTarget {
    val packageWrapper: PackageWrapper?
    fun getOrCreateTargetPsi(originalPsi: PsiElement): PsiElement?
    fun getTargetPsiIfExists(originalPsi: PsiElement): PsiElement?

    // Check possible errors and return corresponding message, or null if no errors are detected
    fun verify(file: PsiFile): String?
}

public class MoveDestinationKotlinMoveTarget(val moveDestination: MoveDestination): KotlinMoveTarget {
    override val packageWrapper: PackageWrapper? = moveDestination.getTargetPackage()

    override fun getOrCreateTargetPsi(originalPsi: PsiElement): PsiElement? =
            moveDestination.getTargetDirectory(originalPsi.getContainingFile())

    override fun getTargetPsiIfExists(originalPsi: PsiElement): PsiElement? =
            moveDestination.getTargetIfExists(originalPsi.getContainingFile())

    override fun verify(file: PsiFile): String? = moveDestination.verify(file)
}

public class JetFileKotlinMoveTarget(val targetFile: JetFile): KotlinMoveTarget {
    override val packageWrapper: PackageWrapper? = targetFile.getPackageName()?.let { packageName ->
        PackageWrapper(PsiManager.getInstance(targetFile.getProject()), packageName)
    }

    override fun getOrCreateTargetPsi(originalPsi: PsiElement): PsiElement? = targetFile

    override fun getTargetPsiIfExists(originalPsi: PsiElement): PsiElement? = targetFile

    // No additional verification is needed
    override fun verify(file: PsiFile): String? = null
}