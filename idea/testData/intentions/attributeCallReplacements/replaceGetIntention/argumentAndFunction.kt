fun test() {
    class Test{
        fun get(a: Int, b: Int, fn: (i: Int) -> Int) : Int = 0
    }
    val test = Test()
    test.g<caret>et(1, 2) { i ->
        i
    }
}
