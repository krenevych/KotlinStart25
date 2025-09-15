package scopefunctions

fun main() {

    val person = Person().apply{
        name = "Mykola"
        lastName = "Ilchuk"
        age = 20

    }

    val resultFromWith = person.let {
        println(it.name)
        println(it.lastName)
        println(it.age)

        // результатом лямбда функції вважається результат останнього оператора у її тілі

        "${it.name}, ${it.lastName}, ${it.age}" // результат лямбда функції з with
    }

    println("resultFromWith = $resultFromWith")




}