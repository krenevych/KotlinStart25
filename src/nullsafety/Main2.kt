package nullsafety

var person2: Person? = null

fun main() {

    person2 = Person().apply {
        name = "Mykola"
        lastName = "Ilchuk"
        age = 20
    }.also {
        println(it.name)
        println(it.lastName)
        println(it.age)
    }

    val resultFromWith = person2?.let {
        println(it.name)
        println(it.lastName)
        println(it.age)

        // результатом лямбда функції вважається результат останнього оператора у її тілі

        "${it.name}, ${it.lastName}, ${it.age}" // результат лямбда функції з with
    }

    println("resultFromWith = $resultFromWith")




}