package MyLearning.StringQuestions

object OddEvenInList extends App {
  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
  println("Original List")
  println(list)

  println("_" * 100)


  //    println("_" * 100)
  //for even
  val evenNum = list.filter(_ % 2 == 0)
  println("Even numbers in a list")
  println(evenNum)

  //for add
  val oddNum = list.filter(_ % 2 != 0)
  println("Odd numbers in a list")
  println(oddNum)


}
