package MyLearning.MyQuestions

object PrimeNumbers extends App {
  val number = 13
  var tempNum = 0

  for (i <- 0 to number  by +1) {
    if (number % 2 == 0) {
      tempNum = tempNum + 1
    }
  }
  if (tempNum > 0) println("number is not prime") else println("number is prime")

}
