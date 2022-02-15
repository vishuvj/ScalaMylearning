package MyLearning

object S10_foldLeft extends App {
  val list = List(1, 2, 3, 4, 5)
  println(list.head)
  println(list.head)
  val result = list.fold(2)(_ + _)
  println(result)


}
