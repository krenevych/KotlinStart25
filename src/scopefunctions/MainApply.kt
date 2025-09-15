package scopefunctions

fun main() {

    val person = Person()

    val p = person.apply{
        name = "Mykola"
        lastName = "Ilchuk"
        age = 20

//        "$name, $lastName, $age"  - не буде результатом apply
        // return this - apply повертає контекстний обʼєкт
    }


    val resultFromWith = with(person) {
        println(name)
        println(lastName)
        println(age)

        // результатом лямбда функції вважається результат останнього оператора у її тілі

        "$name, $lastName, $age" // результат лямбда функції з with
    }

    println("resultFromWith = $resultFromWith")




}