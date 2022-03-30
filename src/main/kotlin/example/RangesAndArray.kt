package example

fun main(args: Array<String>) {
    ranges()
    arrays()
}

fun arrays() {
    var names: Array<String> = arrayOf("john", "jane", "jill")
    names[0] = "john1"
    println(names.toList())

    var values = Array(10) { 2.0 }
    println(values.toList())

    val squares =  Array(10) {it * it}
    println(squares.toList())
}

fun ranges() {
    val a: IntRange = 1..10
    val b = 1.rangeTo(10) // same above
    val c = 1.rangeTo(10).reversed()
    for (x in a) println(x)

    val d = -8
    val e = 3
    val f = IntRange(Math.min(d, e), Math.max(d, e))
    for (variable in f) println(variable)

}
