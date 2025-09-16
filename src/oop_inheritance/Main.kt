package oop_inheritance

fun main() {

//    val person = Person("Maksym", "Paschenko", 19)
//    person.showInfo()


    val student = Student(
        "Maksym",
        "Paschenko",
        19,
        "Math",
        3
    )

    student.showInfo()
    student.showFullInfo()

//    student.name = "Oleg"
}