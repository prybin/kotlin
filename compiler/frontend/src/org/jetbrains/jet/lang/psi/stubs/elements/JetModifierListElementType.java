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

package org.jetbrains.jet.lang.psi.stubs.elements;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.psi.JetModifierList;
import org.jetbrains.jet.lang.psi.stubs.PsiJetModifierListStub;
import org.jetbrains.jet.lang.psi.stubs.impl.PsiJetModifierListStubImpl;

import java.io.IOException;

import static org.jetbrains.jet.lang.psi.stubs.impl.PsiJetModifierListStubImpl.computeMaskFromPsi;

public class JetModifierListElementType extends JetStubElementType<PsiJetModifierListStub, JetModifierList> {
    public JetModifierListElementType(@NotNull @NonNls String debugName) {
        super(debugName);
    }

    @Override
    public JetModifierList createPsiFromAst(@NotNull ASTNode node) {
        return new JetModifierList(node);
    }

    @Override
    public JetModifierList createPsi(@NotNull PsiJetModifierListStub stub) {
        return new JetModifierList(stub);
    }

    @Override
    public PsiJetModifierListStub createStub(@NotNull JetModifierList psi, StubElement parentStub) {
        return new PsiJetModifierListStubImpl(parentStub, computeMaskFromPsi(psi));
    }

    @Override
    public void serialize(@NotNull PsiJetModifierListStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        int mask = ((PsiJetModifierListStubImpl) stub).getMask();
        dataStream.writeVarInt(mask);
    }

    @NotNull
    @Override
    public PsiJetModifierListStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        int mask = dataStream.readVarInt();
        return new PsiJetModifierListStubImpl(parentStub, mask);
    }

    @Override
    public void indexStub(@NotNull PsiJetModifierListStub stub, @NotNull IndexSink sink) {
        //do nothing
    }
}
