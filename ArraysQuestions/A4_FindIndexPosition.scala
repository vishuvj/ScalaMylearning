package MyLearning.ArraysQuestions

object A4_FindIndexPosition extends App {
  val colors = Array("Red", "Blue", "Green", "Pink")
  for (x <- colors) {
    print(s"${x}, ")
  }
  println

  println("Index Position of Red color " + colors.indexOf("Red"))
  println("Index Position of Blue color " + colors.indexOf("Blue"))
  println("Index Position of Green color " + colors.indexOf("Green"))
  println("Index Position of Pink color " + colors.indexOf("Pink"))

}
