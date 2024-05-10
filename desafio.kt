// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASIC, INTERMEDIATE, DIFFICULT }

class User(var name: String, var email: String)

data class EducationalContent(var name: String, val duration: Int = 60)

data class Formation(val name: String, var difficulty: Level, var contents: List<EducationalContent>) {
    val subscribers = mutableListOf<User>()

    fun enroll(user: User) {
        subscribers.add(user)
    }
}

fun main() {
    val programmingLogic = EducationalContent("Lógica de Programação", 40)
    val java = EducationalContent("Java", 80)
    val kotlin = EducationalContent("Kotlin", 80)

    val mobile = Formation("Formação Mobile", Level.BASIC, listOf(programmingLogic, java, kotlin))

    val student1 = User("Rodrigo", "rodrigo@email.com")
    val student2 = User("Rafael", "rafael@email.com")

    mobile.enroll(student1)
    mobile.enroll(student2)

    println("Inscritos na formação Mobile:")
    mobile.subscribers.forEach { println(it.name) }
}