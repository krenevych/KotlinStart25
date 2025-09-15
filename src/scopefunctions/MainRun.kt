package scopefunctions

fun main() {

    val person = Person()

    with(person) {
        name = "Mykola"
        lastName = "Ilchuk"
        age = 20
    }


    val resultFromRun = run {
        println(person.name)
        println(person.lastName)
        println(person.age)

        // результатом лямбда функції вважається результат останнього оператора у її тілі

        "${person.name}, ${person.lastName}, ${person.age}" // результат лямбда функції з with
    }

    println("resultFromWith = $resultFromRun")




}