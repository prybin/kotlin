// IS_APPLICABLE: false
fun main(args: Array<String>) {
    val foo = null
    if (foo > null<caret>) {
        foo
    }
    else {
        throw NullPointerException()
    }
}
