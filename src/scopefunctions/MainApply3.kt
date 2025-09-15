package scopefunctions

fun main() {

    val name = "Yaroslav"

    class Team {

        val teamName: String = "TeamName1"

        val person = Person()
            .apply {
                this.name = "Mykola"
                lastName = "Ilchuk"
                age = 20
                // return this - apply повертає контекстний обʼєкт
            }.apply {
                println(this)
                val teamName = "newTeamName"

                println(this@Team.teamName)
            }
    }

    val t = Team()


}