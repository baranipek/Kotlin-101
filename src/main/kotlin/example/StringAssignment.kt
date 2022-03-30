package example

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    //referentially equal ?
    println("Hello1 and Hello2 is referentially equal ${hello1 === hello2}")

    println("Hello1 and Hello2 is structural equal ${hello1 == hello2}")

    val text: Any = "Any is the root type of kotlin class hierarchy"

    if (text is String) {
        // smart cast
        println(text.uppercase())
    }

    val c = 123.0

    val d = "c = $c , price is ${c/10}"
    println(d)
}