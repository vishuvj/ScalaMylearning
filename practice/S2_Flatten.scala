package MyLearning.practice

object S2_Flatten extends App {

  val list1 = List(List(1, 2, 3), List(4, 5, 6)).flatten
  println(list1)

  print("_" * 100)
  println
  val flatten = List(Some(1), Some(2), None, Some(4), None).flatten
  println(flatten)

  //
  print("_" * 100)
  println


}
