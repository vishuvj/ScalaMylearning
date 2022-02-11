package MyLearning

object S6_Pattern_Matching {
  def main(args: Array[String]): Unit = {
    val age = 23
    //match as statement
    age match {
      case 20 => println(age)
      case 21 => println(age)
      case 22 => println(age)
      case 23 => println(age)
      case _ => println("default")
    }

    //match as expression
    val pMatch = age match {
      case 20=>age
      case 21=>age
      case 22=>age
      case 23=>age
    }
    println("match = "+pMatch)

    //second method with function
    var result = search("Hello")
  }

  def search(a: Any): Any =a

  match
  {
    case 1 => println("one")
    case "Two" => println("Two")
    case "Hello" => println("one")
    case _ => println("No")
  }


}
