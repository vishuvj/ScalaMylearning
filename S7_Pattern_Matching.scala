package MyLearning

object S7_Pattern_Matching {
  def main(args: Array[String]): Unit = {
    //odd even pattern matching
    // multi cases in one case

    val i = 7
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 10 => println("even")
    }
  }

}
