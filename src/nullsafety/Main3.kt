package nullsafety

class Team(
    var person1: Person,
    var person2: Person,
//    var person3: Person = null,
)

var team: Team? = null

fun main() {

    // задаються імена та вік учасників команди...

    team = Team(
        Person(
            "Mykola", "Ilchuk", 20
        ),
        Person(
            "Maksym", "Paschenko", 19
        )
    )

    println(team!!.person2.name) // Do not use !!. in release code!!!!!
//    println(team.person2.lastName)
//    println(team.person2.age)



}