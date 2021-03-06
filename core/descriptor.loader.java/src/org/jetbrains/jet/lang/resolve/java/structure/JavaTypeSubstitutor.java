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

package org.jetbrains.jet.lang.resolve.java.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.Map;

public interface JavaTypeSubstitutor {
    JavaTypeSubstitutor EMPTY = new JavaTypeSubstitutor() {
        @NotNull
        @Override
        public JavaType substitute(@NotNull JavaType type) {
            return type;
        }

        @Nullable
        @Override
        public JavaType substitute(@NotNull JavaTypeParameter typeParameter) {
            return typeParameter.getType();
        }

        @NotNull
        @Override
        public Map<JavaTypeParameter, JavaType> getSubstitutionMap() {
            return Collections.emptyMap();
        }

        @Override
        public String toString() {
            return "Empty JavaTypeSubstitutor";
        }
    };

    @NotNull
    JavaType substitute(@NotNull JavaType type);

    @Nullable
    JavaType substitute(@NotNull JavaTypeParameter typeParameter);

    @NotNull
    Map<JavaTypeParameter, JavaType> getSubstitutionMap();
}
