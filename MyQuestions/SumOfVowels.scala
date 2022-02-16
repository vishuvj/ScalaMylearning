package MyLearning.MyQuestions

object SumOfVowels extends App {
  val name = "VIshal Jadon"
  val nameLength = name.length() - 1
  var counter = 0
  val nameToLowercase = name.toLowerCase

  for (x <- 0 to nameLength) {
    if (nameToLowercase.charAt(x) == 'a' || nameToLowercase.charAt(x) == 'e' ||
      nameToLowercase.charAt(x) == 'i' || nameToLowercase.charAt(x) == 'o' || nameToLowercase.charAt(x) == 'u') {
      counter = counter + 1
    }
  }
  println("The total number of vowels is : " + counter)


}
