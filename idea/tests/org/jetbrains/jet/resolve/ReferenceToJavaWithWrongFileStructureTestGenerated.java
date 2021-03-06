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

package org.jetbrains.jet.resolve;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.resolve.AbstractReferenceToJavaWithWrongFileStructureTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/referenceToJavaWithWrongFileStructure")
public class ReferenceToJavaWithWrongFileStructureTestGenerated extends AbstractReferenceToJavaWithWrongFileStructureTest {
    public void testAllFilesPresentInReferenceToJavaWithWrongFileStructure() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/referenceToJavaWithWrongFileStructure"), Pattern.compile("^(.+)\\.kt$"), false);
    }
    
    @TestMetadata("ClassStatics.kt")
    public void testClassStatics() throws Exception {
        doTest("idea/testData/resolve/referenceToJavaWithWrongFileStructure/ClassStatics.kt");
    }
    
    @TestMetadata("SimpleClass.kt")
    public void testSimpleClass() throws Exception {
        doTest("idea/testData/resolve/referenceToJavaWithWrongFileStructure/SimpleClass.kt");
    }
    
}
