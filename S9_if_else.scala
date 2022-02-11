package MyLearning

object S9_if_else {
  def main(args: Array[String]): Unit = {
    val age = 23
    // if statement

    //    if (age > 24) println("Age is less than 24")
    //    println("hello world")

    //if-else statement

    //    if (age > 24) println(age) else println("age is less than 24  " + age)

    //if-else-if ladder statement
    var num: Int = 85
    if (num >= 0 && num < 50) {
      println("fail")
    }
    else if (num >= 50 && num < 60) {
      println("D Grade")
    }
    else if (num >= 60 && num < 70) {
      println("C Grade")
    }
    else if (num >= 70 && num < 80) {
      println("B Grade")
    }
    else if (num >= 80 && num < 90) { // this statement will be execute
      println("A Grade")
    }
    else if (num >= 90 && num <= 100) {
      println("A+ Grade")
    }
    else
      println("Invalid")

    //
    val result = checkIt(-10)
    println(result)
  }

  def checkIt(a: Int) = if (a >= 0) 1 else -1
}
