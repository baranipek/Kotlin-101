package example

import javacode.DummyClass

fun main(args: Array<String>) {

    val stringArrays = arrayOf("element1", "element2")
    val arrays1 = arrayOf<Long>(1, 2, 4)

    println("arrays1 is long array ${arrays1 is Array<Long>}")
    println("stringArrays is long array ${stringArrays is Array<String>}")
    println(arrays1[2])

    val evenNumbers = Array(16) { i -> i * 2 }

    for (evenNumber in evenNumbers) {
        println(evenNumber)
    }

    val countNumbers = Array(100000) { i -> i + 1 }

    for (countNumber in countNumbers) {
        println(countNumber)
    }

    val allZeros = Array(100000) { 0 }

    for (allZero in allZeros) {
        println(allZero)
    }

    var mixArray = arrayOf(2, 4, "string", 3.4)

    for (element in mixArray) {
        println(element)
    }

    var intArray = intArrayOf(2, 4, 2)

    var intTypeArray: Array<Int> = intArray.toTypedArray()
    // call java int []
    DummyClass().printIntArray(evenNumbers.toIntArray())


}