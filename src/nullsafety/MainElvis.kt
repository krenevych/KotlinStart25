package nullsafety


//fun showSomething(something: String? = null){
//
//    if (something != null){
//        println(something)
//    } else {
//        println("something is null")
//    }
//
//}

//fun showSomething(something: String? = null){
////    something?.let { println(something) } ?: println("something is null")
////     println(something)  ?: println("something is null")
//
//    something ?: return
//
//    println(something)
//
//}

fun showPersonInfo(person: Person?) {
    person ?: return

    println("${person.name}, ${person.lastName}")
}

fun main() {
//    showPersonInfo(Person(
//        "Mykola", "Ilchuk", 20
//    ))
    showPersonInfo(null)
}