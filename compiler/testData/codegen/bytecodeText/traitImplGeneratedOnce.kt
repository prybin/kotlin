trait A {
    fun foo() = 42
}

open class B : A

open class C : B()

class D : C()

// Implementation of foo() should only be generated into B
// 1 INVOKESTATIC A\$\$TImpl.foo
