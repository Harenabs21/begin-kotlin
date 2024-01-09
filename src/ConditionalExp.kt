fun main() {
    val a = 1
    val b = 2
    val bool = true

    // if statement
    println(if (bool) a else b)

    // when statement
    val list = listOf(1,3,4)
    val result = when {
        list.contains(a) -> "$a is present in the list"
        !list.contains(b) -> "$b isn't present in the list"
        else -> "nothing special"
    }
    println(result)
}