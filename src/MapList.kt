fun main() {
    val number2word = mapOf(1 to "one",2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
    val mutableNumber2word = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableNumber2word[4] = "four"
    println(mutableNumber2word)
}