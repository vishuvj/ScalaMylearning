package MyLearning.MyQuestions

object DuplicateElementInArray extends App {
  val integerList = Array(1, 2, 3, 4, 1, 7, 2, 9, 20)
  for (x <- 0 until integerList.length) {
    for (y <- x + 1 until integerList.length) {
      if (integerList(x) == integerList(y)) {
        println(x) // print only duplicate element of an array
      }
    }
  }

}
