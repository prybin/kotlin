fun main(args: Array<String>) {
    hashMap("one" to 1,
            "two" to null,
            "three" to 3).get("one")<caret>!!
}
