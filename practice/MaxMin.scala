package MyLearning.practice

object MaxMin {
  def main(args: Array[String]): Unit = {
    val num = List(2, 45, 65, 98, 67, 90, 32, 54, 82, 12, 5)
    val li = 0;
    val hi = num.length
    val temp = 0;
    var min = 0;

    //find min_max without method
    val (minimum, maximum) = num.foldLeft((num.head, num.head)) {
      case ((min, max), next) =>
        if (next > max) (min, next)
        else if (next < min) (next, max)
        else (min, max)
    }
    println(minimum, maximum)


    //
    println("Minimum and Maximum with function " + min_max(num))
  }

  def min_max(a: List[Int]): (Int, Int) = {
    a.foldLeft((a(0), a(0))) {
      case ((min, max), e) => (math.min(min, e), math.max(max, e))
    }
  }
}
