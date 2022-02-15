package MyLearning.StringQuestions

object S1_OccureneceOfCharacter extends App {
  val name = "Vishal Jadon"
  val count = name.toCharArray.length
  println(name + " => length of charaters is : " + count)
  println("+-------------+-----------+")
  println("\tCharacter\tFrequency")

  val occurrence = name.count(_ == 'a')
  println(occurrence)


}
