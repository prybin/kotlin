// "Suppress 'REDUNDANT_NULLABLE' for statement " "false"
// ACTION: Disable 'Move lambda function into parentheses'
// ACTION: Edit intention settings
// ACTION: Move lambda function into parentheses
// ACTION: Remove redundant '?'

fun foo() {
    any {
        (x: String?<caret>?) ->
    }
}

fun any(a: Any?) {}