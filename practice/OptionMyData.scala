package MyLearning.practice


case class Student(id: Int, name: String, marks: Double, gender: String
                  )

object OptionMyData extends App {
  val students = Map(1 -> Student(10, "Vishal", 62.5, ("male")),
    2 -> Student(12, "Divya", 64.9, ("female")),
    3 -> Student(15, "Rajat", 89.9, ("male")))

//
//  val str = students.findById(12)
//  if (str.isDefined) {
//    println(str.get.id)
//    println(str.get.Name)
//    println(str.get.marks)


}