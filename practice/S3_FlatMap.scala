package MyLearning.practice

object S3_FlatMap extends App {
  val list1 = List(1, 2, 3, 4).flatMap(x => List(x, x + 1))
  println(list1)


  //flatmap if else
  print("_" * 100)
  println
  val list2 = List(1, 2, 3).flatMap(x => if (x < 5) List(x) else List(x * 2))
  println(list2)

  //
  print("_" * 100)
  println
  val list3 = List(1, 2, 3, 4, 5).flatMap(x => if (x <= 3) Some(x * 2) else None)
  println(list3)
}
