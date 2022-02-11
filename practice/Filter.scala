package MyLearning.practice

object Filter {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = list.filter((item: Int) => item % 2 == 0)
    for (x <- result)
      println(s" $x")
  }

}
