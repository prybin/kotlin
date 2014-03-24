// IS_APPLICABLE: false
fun main(args: Array<String>) {
    val foo: Int? = 4
    if (foo * 10<caret>) {
        foo
    }
    else {
        throw NullPointerException()
    }
}
