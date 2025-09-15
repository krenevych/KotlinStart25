package scopefunctions

fun main() {
//    val person = Person(
//        "Mykola", "Ilchuk", 20
//    )

    val person = Person()

//    person.name = "Mykola"
//    person.lastName = "Ilchuk"
//    person.age = 20
//
//    println(person.name)
//    println(person.lastName)
//    println(person.age)

//    println(person.name )
//    with(person) {  // заради одного розіменування сенсу використовувати оператор with немає.
//        println(name)
//    }

//    val name = "Yaroslav"

    with(person) {
//        this.name = name
        name = "Mykola"
        lastName = "Ilchuk"
        age = 20

        println(name)
        println(lastName)
        println(age)
    }




//    println(person)


}