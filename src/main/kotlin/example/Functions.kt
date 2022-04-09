package example

fun main(args: Array<String>) {
    println("result 3*3 == ${triple(3)}")
    println("result 3*3 == ${tripleAnotherway(3)}")
    println("3 hours , 100 hourly rate ${calculateWages(3, 100.0)}")
    println(" default hours ,100 hourly rate ${calculateWages(hourly_rate = 100.0)}")
    println(" 2 hours ,default hourly rate ${calculateWages(hours_worked = 2)}")
    println("sum of 1,2,3 is  ${sumUp(1, 2, 3)} ")
}

fun sayHello(): Unit {
    println("Hi hello")
}

fun triple(x: Int): Int {
    return x * 3
}

fun tripleAnotherway(x: Int) = x * 3

fun calculateWages(hours_worked: Int = 16, hourly_rate: Double = 120.0): Double {
    return hourly_rate * hours_worked
}

fun sumUp(vararg values: Int): Int {
    var sum = 0
    for (value in values) {
        sum += value
    }
    return sum
}