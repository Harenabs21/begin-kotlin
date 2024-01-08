// Read only list
var list = listOf("dad","mom","children")
fun main(){
    println(list)
    println("the first element of the list is: ${list[0]}")
    println("another method for the first element of the list: ${list.first()}")
    println("first method for the last element of the list: ${list[list.count() - 1]}")
    println("second method for the last element of the list: ${list.last()}")
}