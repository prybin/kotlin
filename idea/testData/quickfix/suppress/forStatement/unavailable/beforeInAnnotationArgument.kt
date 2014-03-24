// "Suppress 'INTEGER_OVERFLOW' for statement " "false"
// ACTION: Inspection 'INTEGER_OVERFLOW' options

[Ann(Integer.MAX_VALUE<caret> + 1)]
fun foo() {}

annotation class Ann(val b: Int)