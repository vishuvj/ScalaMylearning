package MyLearning.MyQuestions

object StarPattern extends App {

  //  for (i <- 1 to 5) { // for rows
  //    for (j <- 0 to i) { // for column
  //      print("*")
  //    }
  //    println
  //  }
  for (x <- 1 until 6) {
    println("*" * x)
  }
  for (x <- 4 until 0 by -1) {
    println("*" * x)
  }

}
