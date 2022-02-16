package MyLearning.MyQuestions

object PalindromeNumbers extends App {
  val number = 525
  var tempNumber = number
  var reverseNumber = 0
  var remainder = 0

  //check number is palindrome or not
  while (tempNumber > 0) {
    remainder = tempNumber % 10
    reverseNumber = (reverseNumber * 10) + remainder
    tempNumber = tempNumber / 10
  }

  if (number == reverseNumber)
    println(number + " is palindrome")
  else println(number + " is not palindrome")

}
