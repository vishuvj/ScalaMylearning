package MyLearning

object S4_Do_While_Loop {
  def main(args: Array[String]): Unit = {
    var x = 0;

    while (x < 10) {
      println("x = " + x)
      //        x++ is not allowed in scala
      x += 1;
    }
    var y = 0;

    // do while loop run at least once even if condition is false
    do {
      println("y= " + y)
      y += 1;
    }
    while (y < 0)

  }

}
