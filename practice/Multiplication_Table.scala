package MyLearning.practice

object Multiplication_Table {
  def main(args: Array[String]): Unit = {
    //Table
    //    val num: Int = 2
    //    for (i <- 1 to 10) {
    //      println(num + " x = " + num * i)
    //    }

    //
    val store = for (i <- 0 to 10) yield i
    for (a <- store) {
      print(a + " ")
    }

    println
    print("_" * 80)
    println

    val lst = List(19, 23, 56, 78, 12, 8, 5, 3, 41, 94, 47)
    val lst1=lst.filter((item:Int)=> item<50)

    for (i <- lst1)
      print(i + " ")

  }

}
