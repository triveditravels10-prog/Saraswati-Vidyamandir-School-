// mind_academia.kt
data class Student(val name: String, val cls: String, val achievement: String)

fun main() {
    val students = listOf(
        Student("Rohan Kumar", "10th", "Math Topper"),
        Student("Anjali Singh", "9th", "Debate Champion")
    )

    println("Student List:")
    students.forEach { println("${it.name} | ${it.cls} | ${it.achievement}") }
}
