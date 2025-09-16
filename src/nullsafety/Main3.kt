package nullsafety

class Team(
    var person1: Person,
    var person2: Person,
//    var person3: Person = null,
)

lateinit var team: Team

fun main() {

    // задаються імена та вік учасників команди...

//    team = Team(
//        Person(
//            "Mykola", "Ilchuk", 20
//        ),
//        Person(
//            "Maksym", "Paschenko", 19
//        )
//    )

    println(team.person2.name)
    println(team.person2.lastName)
    println(team.person2.age)



}