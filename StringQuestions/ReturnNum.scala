package MyLearning.StringQuestions


object ReturnNum extends App {
  def getSum( x: Int): Int = {
    var sum = 0
    while (x != 0) {
      sum = sum + x % 10
      x / 10
    }
    return sum
  }

  def getMultiply(y: Int): Int = {
    var mul = 1
    while (y != 0) {
      mul = mul * (y % 10)
      y / 10
    }
    return mul
  }

  val num = 525
  println(getSum(num))


}
