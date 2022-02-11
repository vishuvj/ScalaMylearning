package MyLearning

object S5_for_loop {
  def main(args: Array[String]): Unit = {
    ///for loop as a statement
    //range method
    for (a <- 1 to 5) {
      //      println(a)
    }

    //until method
    for (i <- 1.until(6)) {
      //      println("i using until " + i)
    }

    //nested loop multiple ranges in one for loop
    for (i <- 1 to 7; j <- 1 to 4) {
      //      println("i using until " + i + " " + j)
    }

    //
    val lst = List(1, 2, 31, 14, 28, 42, 5, 6, 79, 8)
    for (i <- lst) {
      //      println("i using lst " + i)
    }
    // filtering
    for (i <- lst; if i < 50) {
      println("value of i " + i)
    }


    // for loop as expression
    val result = for {i <- lst
                      if i < 40} yield {
      i * i
    }
    println("result = " + result)
  }

}
