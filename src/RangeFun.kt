fun main() {
    val a = 9
    val b = 7
    val c = 5
    var d = 0
    var e = 0
    // for loop
    for (num in 0..10) {
        println("$a x $num = ${ a * num} ")
    }

    // while loop
    while ( d <= 10) {
        println("$b x $d = ${ b * d } ")
        d++
    }

    // do-while loop
    do {
        println("$c x $e = ${ c * e } ")
        e++
    }while ( e < d)
}