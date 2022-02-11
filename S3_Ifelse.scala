package MyLearning

object S3_Ifelse {
  def main(args: Array[String]): Unit = {
    val x = 20;
    var res = ""
    val y = 30

    //if-else
    if (x == 20) {
      //      println("x==20")
      res = "x==20"
    } else
    //      println("x!=20")
      res = "x!=20"

    println(res)

    val res2 = if (x != 20) "x==20" else "x!=20"
    println(res2)


    println(if (x != 20) "x==20" else "x!=20")

    // && both condition true then true || one condition true then true
    println(if (x == 20 && y == 30) "true" else "false")

  }
}
