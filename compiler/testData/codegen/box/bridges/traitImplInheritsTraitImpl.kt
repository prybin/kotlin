trait A {
    fun foo(): Any = "A"
}

trait B : A {
    override fun foo(): String = "B"
}

class C : B

fun box(): String {
    val c = C()
    var r = c.foo() + (c : A).foo()
    return if (r == "BB") "OK" else "Fail: $r"
}
