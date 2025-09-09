package dataclasses


fun main() {
    val person1 = Person("Andrii", "Krenevych", 20)
    val person2 = Person("Andrii", "Krenevych", 20)
    println(person1)

    println(person1 === person2)
    println(person1 == person2)

//    val person3 = person1
//
//    println(person1 === person3)  // порівняння посилань
//    println(person1 == person3)  // порівняння контенту

    val (name1, lastName1, age1) = person1  // розпакування
    println("$name1, $lastName1, $age1")

    val newPerson = person1.copy()  // копіювання
    println(newPerson)
    println("ref: ${newPerson === person1}")
    println("eq : ${newPerson == person1}")

    val person3 = person1.copy(age = 25)
    println(person3)

}