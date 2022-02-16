package MyLearning.MyQuestions

object SumOfVowel extends App {
  val name = "Vishal Jadon"
  val nameToLowerCase = name.toLowerCase
  val vowelsList = List('a', 'e', 'i', 'o', 'u')
  var counter = 0
  for (vowel <- vowelsList) {
    for (letter <- name.toCharArray()) {
      if (letter == vowel) {
        counter = counter + 1
      }
    }
  }

  println("The total of all vowels in a string : " + counter)

}
// if (nameToLowerCase.contains('a')
//    || nameToLowerCase.contains('e')
//    || nameToLowerCase.contains('i')
//    || nameToLowerCase.contains('o')
//    || nameToLowerCase.contains('u')) {
//    counter = counter + 1
//  }
