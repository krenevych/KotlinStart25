package scopefunctions

fun main() {

    val person = Person()

    with(person) {
        name = "Mykola"
        lastName = "Ilchuk"
        age = 20
    }


    val resultFromRun = person.run {
        println(name)
        println(lastName)
        println(age)

        // результатом лямбда функції вважається результат останнього оператора у її тілі

        "${name}, ${lastName}, ${age}" // результат лямбда функції з with
    }

    println("resultFromWith = $resultFromRun")




}