package scopefunctions

fun main() {


    val person = Person()
        .apply {
            name = "Mykola"
            lastName = "Ilchuk"
            age = 20
            // return this - apply повертає контекстний обʼєкт
        }.also {
            println(it)
            // return this
        }.also {per: Person ->
            println(per)
            // return this
        }

    println(person)

}