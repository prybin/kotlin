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

package org.jetbrains.jet.lang.cfg.pseudocode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.psi.JetElement;

public class SubroutineEnterInstruction extends InstructionWithNext {
    private final JetElement subroutine;

    public SubroutineEnterInstruction(@NotNull JetElement subroutine, @NotNull LexicalScope lexicalScope) {
        super(subroutine, lexicalScope);
        this.subroutine = subroutine;
    }

    public JetElement getSubroutine() {
        return subroutine;
    }

    @Override
    public void accept(@NotNull InstructionVisitor visitor) {
        visitor.visitSubroutineEnter(this);
    }

    @Override
    public <R> R accept(@NotNull InstructionVisitorWithResult<R> visitor) {
        return visitor.visitSubroutineEnter(this);
    }

    @Override
    public String toString() {
        return "<START>";
    }

    @NotNull
    @Override
    protected Instruction createCopy() {
        return new SubroutineEnterInstruction(subroutine, lexicalScope);
    }
}
