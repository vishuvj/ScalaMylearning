package MyLearning.StringQuestions

object S1_OccureneceOfCharacter extends App {

  //first approach
  val name = "My name is Vishal Jadon"
  val count = name.toCharArray.length
  println(name + "\nLength of character is : " + count)
  val occurrence = name.count(_ == 'a')
  println("First approach : "+ occurrence)

  //second approach
  var counter=0
  for (i <- 0 until name.length) {
    if (name.charAt(i) == 'a') counter =counter+1
  }
  println("Second approach : "+counter)

  //

}
