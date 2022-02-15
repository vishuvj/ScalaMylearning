package MyLearning.ArraysQuestions

object A7_RotateOneElement {
  def rotate_left(x: Array[Int]): Array[Int] = {
    if (x.length < 1) false
    x.tail :+ x.head
  }

  def main(args: Array[String]): Unit = {
    val num1 = Array(1, 2, 3, 4, 5)
    //print all element of an array
    for (x <- num1) {
      print(s"${x}, ")
    }
    println

    val result_rotate = rotate_left(num1)
    for (x <- result_rotate) {
      print(s"${x}, ")
    }
  }


}
