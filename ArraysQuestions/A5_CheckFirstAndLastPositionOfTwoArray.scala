package MyLearning.ArraysQuestions

object A5_CheckFirstAndLastPositionOfTwoArray {
  def check(x: Array[Int], y: Array[Int]): Boolean = {
    if (x.length < 1 || y.length < 1) false
    else (x.head == y.head) || (x.last == y.last)

  }

  def main(args: Array[String]): Unit = {
    println(check(Array(2, 2, 3, 4), Array(1, 2, 3, 5)))

    println(check(Array(1 , 2, 3, 4), Array(1, 2, 3, 4)))

  }

}
