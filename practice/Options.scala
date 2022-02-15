package MyLearning.practice

object Options extends App {
  val myData = Map("Vishal" -> "Student", "Rajat" -> "Teacher", "Divya" -> "Principle")

  val x = myData.get("Vishal")
  val y = myData.get("Raj")

  println(x)
  println(y)

  println("_" * 100)

  //Option through patter matching
  def patternMatching(z: Option[String]) = z match {
    case Some(s) => (s)
    case None => ("Key is not found")
  }

  println(patternMatching(myData.get("Vishal")))
  println(patternMatching(myData.get("Raj")))

  println("_" * 100)
  //using getOrElse() Method
  val some: Option[Int] = Some(15)
  val none: Option[Int] = None

  val a = some.getOrElse(0)
  val b = none.getOrElse(17)

  println(a)
  println(b)


  println("_" * 100)
  //isEmpty() method
  val c = some.isEmpty
  val d = none.isEmpty
  println(c)
  println(d)


}
