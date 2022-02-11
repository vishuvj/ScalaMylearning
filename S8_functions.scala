package MyLearning

object S8_functions {
  //
  def add(x: Int, y: Int): Int = {
    return x + y
  }

  //parameterized function
  def subtract(x: Int, y: Int): Unit = {
    var c = x - y
    println(c)
  }

  def functionExample()={
    var a = 10
    a
    // this is return type is it not necessary to use return keyword last line of function considered as a return type
  }

  //function in one line
  def  multiply(a:Int, b:Int):Int=a*b
//  def  multiply(a:Int, b:Int)a*b

  def main(args: Array[String]): Unit = {
    println(add(45, 15))
    subtract(30, 15)

    var result = functionExample()
    println(result)

    println("One line function "+ multiply(2,8))
  }
}