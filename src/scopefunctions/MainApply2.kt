package scopefunctions

fun main() {

    val person = Person()
        .apply {
            name = "Mykola"
            lastName = "Ilchuk"
            age = 20
            // return this - apply повертає контекстний обʼєкт
        }.apply {
            println(name)
            println(lastName)
            println(age)
        }.apply {
            println( "${name}, ${lastName}, ${age}")
        }

    println(person)



}