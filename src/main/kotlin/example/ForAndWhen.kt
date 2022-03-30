package example

fun main(args: Array<String>) {
    for_loop()
    when_expression()
}

fun when_expression() {
    var code = 34
    when (code) {
        12 -> println("code $code")
        in 1..10 -> println("code is less then")

    }
}

fun for_loop() {

    for (a in (10 downTo 1)) println("$a")

    var arrays = intArrayOf(1, 2, 3)

    for ((index, value) in arrays.withIndex())
        println("$index : $value")

    val capitals = mapOf<String, String>("paris" to "france", "ankara" to "turkey")
    for ((index, value) in capitals) println("$index : $value")
}
