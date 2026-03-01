// scholar_universe.scala
case class Student(name: String, cls: String, achievement: String)
object SchoolApp extends App {
  val students = List(
    Student("Rohan Kumar", "10th", "Math Topper"),
    Student("Anjali Singh", "9th", "Debate Champion")
  )
  
  println("Student List:")
  students.foreach(s => println(s"${s.name} | ${s.cls} | ${s.achievement}"))
}
