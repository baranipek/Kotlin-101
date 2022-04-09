package example

fun main(args: Array<String>) {
    var john = Person("john")
    var boss = Manager("john", listOf(john))
    boss.talk()

}

open class Person(var name: String) {
    open fun talk() {
        println("person talks ${name}")
    }
}

class Manager(name: String, var employee: List<Person>) : Person(name) {
    override fun talk() {
        println("Boss talks ${employee.size} ")
    }
}