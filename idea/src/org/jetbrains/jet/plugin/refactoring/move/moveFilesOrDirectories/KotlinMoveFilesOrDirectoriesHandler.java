/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.plugin.refactoring.move.moveFilesOrDirectories;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.lang.psi.JetClassOrObject;
import org.jetbrains.jet.lang.psi.JetDeclaration;
import org.jetbrains.jet.lang.psi.JetFile;

import java.util.ArrayList;

public class KotlinMoveFilesOrDirectoriesHandler extends MoveFilesOrDirectoriesHandler {
    public static boolean isMovableClass(@NotNull JetClassOrObject clazz) {
        if (!(clazz.getParent() instanceof JetFile)) return false;
        for (JetDeclaration declaration : clazz.getContainingFile().getDeclarations()) {
            if (declaration instanceof JetClassOrObject && declaration != clazz) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean canMove(PsiElement[] elements, @Nullable PsiElement targetContainer) {
        ArrayList<PsiElement> adjustedElements = new ArrayList<PsiElement>();
        for (PsiElement element : elements) {
            if (element instanceof PsiFile || element instanceof PsiDirectory) {
                adjustedElements.add(element);
                continue;
            }

            if (element instanceof JetClassOrObject && element.getParent() instanceof JetFile) {
                adjustedElements.add(element.getParent());
                continue;
            }

            return false;
        }
        return super.canMove(adjustedElements.toArray(new PsiElement[adjustedElements.size()]), targetContainer);
    }

    @Override
    public PsiElement[] adjustForMove(@NotNull Project project, @NotNull PsiElement[] sourceElements, PsiElement targetElement) {
        ArrayList<PsiElement> result = new ArrayList<PsiElement>(sourceElements.length);
        for (PsiElement element : sourceElements) {
            if (element instanceof JetClassOrObject) {
                result.add(element.getContainingFile());
            }
            else {
                result.add(element);
            }
        }
        return result.toArray(new PsiElement[result.size()]);
    }
}
