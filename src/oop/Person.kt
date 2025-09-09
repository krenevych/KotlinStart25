package oop

class Person(
    name: String,
    lastName: String,
    age: Int
) {

    var name: String = name
        get() {
            print("поле name:")
            return field  // field - спеціальний обʼєкт, що містить посилання на поточне поле
        }
        set(value) {
            println("Відбувається зміна поля name. Старе зачення=$name, нове значення=$value")
            if (value == "") {
                println("Поле name не було змінено!")
            } else {
                field = value
            }
        }

    var lastName = lastName
        get() {
            return field
        }
    var age = age

    //    init {
    //        id = idCounter++  // не можемо, бо поля ще не існує
    //    }
    var id: Int
        private set


    init {
        println("init-1")
        println("Відпрацьовує первинний конструктор")

        id = idCounter++

    }

    constructor()// вторинний конструктор
            : this("", "", 0) {  // виклик первинного конструктора

        println("Створення обʼєкту за допомогою вторинного конструктора-1")
    }

    constructor(name: String)
            : this(name, "", 0) {
        println("Створення обʼєкту за допомогою вторинного конструктора-2")

    }

    override fun toString(): String {
        return "dataclasses.Person(name='${this@Person.name}', lastName='${this@Person.lastName}', age=${this@Person.age}, id=$id)"
    }

    init {
        println("init-2 - завершення роботи первинного конструктора для обʼєкту з id=$id завершено")
    }

    companion object {  // статика у Котлін
        var idCounter = 0
    }
}