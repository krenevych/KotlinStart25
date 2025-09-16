package nullsafety

class Team(
    var person1: Person,
    var person2: Person,
//    var person3: Person = null,
)

var team: Team? = null

fun main() {

    team = Team(
        Person(
            "Mykola", "Ilchuk", 20
        ),
        Person(
            "Maksym", "Paschenko", 19
        )
    )

    println(team?.person2?.name)
    println(team?.person2?.lastName)
    println(team?.person2?.age)

    team?.let {
        with(it.person2){
            println(name)
            println(lastName)
            println(age)
        }

    }


}