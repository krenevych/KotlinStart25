package oop_inheritance

abstract class Person(
//open class Person(
    private var name: String = "",
    private var lastName: String = "",
    private var age: Int = 0
) {

    open fun showInfo() {
        println("name='$name', lastName='$lastName', age=$age")
    }

    abstract fun showFullInfo()
}