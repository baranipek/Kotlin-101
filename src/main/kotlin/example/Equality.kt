package example

fun main(args: Array<String>) {

    // in kotlin == operator checks first structural equality
    // in kotlin === operator checks referential  equality

    val employee1 = Employee("mary", 1)
    val employee2 = Employee("john", 2)
    val employee3 = Employee("john", 2)
    val employee4 = employee3

    printEmployeeEquality(employee1, employee2)
    printEmployeeEquality(employee3, employee2)
    printEmployeeEquality1(employee3, employee2)
    printEmployeeReferentialEquality(employee3, employee2)
    printEmployeeReferentialEquality(employee4, employee3)
    printEmployeeEquality1(employee3, employee4)

}

// in kotlin === operator checks referential  equality , almost same == in java
fun printEmployeeReferentialEquality(employeeFirst: Employee, employeeSecond: Employee) {
    println(employeeFirst === employeeSecond)
}

fun printEmployeeEquality(employeeFirst: Employee, employeeSecond: Employee) {
    println(employeeFirst == employeeSecond)
}

fun printEmployeeEquality1(employeeFirst: Employee, employeeSecond: Employee) {
    println(employeeFirst.equals(employeeSecond))
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }
}