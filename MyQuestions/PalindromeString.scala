package MyLearning.MyQuestions

object PalindromeString extends App {
  def stringReverseFunction(string: String): String = {
    (for (i <- string.length - 1 to 0 by -1) yield string(i)).mkString
  }

  val name = "Vishal"
  val reverseString = stringReverseFunction(name)
  println("Original String : " + name)
  println("Reverse String : " + reverseString)

  if (name == reverseString)
    println("String is palindrome") else println("String is not palindrome")
}
