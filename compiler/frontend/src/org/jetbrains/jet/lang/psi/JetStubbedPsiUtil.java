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

package org.jetbrains.jet.lang.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JetStubbedPsiUtil {
    @Nullable
    public static JetDeclaration getContainingDeclarationElement(@NotNull PsiElement element) {
        return getContainingDeclarationElement(element, JetDeclaration.class, true);
    }

    @Nullable
    public static <T extends JetDeclaration> T getContainingDeclarationElement(
            @NotNull PsiElement element,
            Class<T> declarationClass,
            boolean strict
    ) {
        if (!strict && declarationClass.isInstance(element)) {
            return (T) element;
        }
        if (element instanceof JetElementImplStub) {
            StubElement<?> stub = ((JetElementImplStub) element).getStub();
            if (stub != null) {
                return stub.getParentStubOfType(declarationClass);
            }
        }
        return PsiTreeUtil.getParentOfType(element, declarationClass, strict);
    }

    private JetStubbedPsiUtil() {
    }
}
