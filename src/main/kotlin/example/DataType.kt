package example

import javacode.DummyClass


fun main(args: Array<String>) {

    var myInt: Int = 23
    var myLong: Long = 24

    // in Java you do not need to convert
    myInt = myLong.toInt()

    println("My Int value $myInt")

    val myBoolean = false
    val onVacation = DummyClass().isVacation(myBoolean)
    println(onVacation)
}