package MyLearning.ArraysQuestions

object A1_SumOfArray extends App {
  val myList = List(1, 2, 3, 4, 5, 6, 7)
  var total = 0

  // print all elements
  println(s"$myList")

  //add all element without any method
  for (i <- 0 to myList.length - 1) {
    total += myList(i)
  }
  println(s"Result ${total}")

  //add element with method
  println("Total with sum method "+ myList.sum)

}
