package oop

fun main() {

    val person0 = Person("Andrii", "Krenevych", 20);
    val person1 = Person()
    val person2 = Person("Andrii")

    println(person0)
    println(person1)
    println(person2)

    person0.name = "New Andrii"
    person0.name = ""
    println(person0.name)

//    person0.id = 100500  // не допустима бо ми зробили приватним сетер
    println(person0.id)
    println(person0)


}