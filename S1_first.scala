package MyLearning

object S1_first {
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    var b: Int = 20
    var c: Int = a + b+30
    println("The sum of a and b is : " + c)
    var z= { val x : Int=15; val y: Int =15; x+y }
    println("The value of x and y is : "+z)
  }
}
