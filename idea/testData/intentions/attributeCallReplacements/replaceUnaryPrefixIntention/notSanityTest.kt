// INTENTION_TEXT: Replace with '!' prefix
fun test() {
    class Test {
        fun not(): Test = Test()
    }
    val test = Test()
    test.n<caret>ot()
}
