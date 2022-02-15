package MyLearning.StringQuestions

import scala.tools.nsc.ast.TreeBrowsers.Document.break

object S2_OccurenceOfCharacter extends App {


  val name = "Vishal Jadon"
  val char = name.toCharArray()
  println("+-------------+-----------+")
  println("\tCharacter\tFrequency")
  for (i <- 0 to name.length - 1) {
    i + 1
    var a = i
    var count = 0
    for (j <- 0 to name.length - 1) {
      j + 1
      if (j < i && (char(j) == char(i))) {
        break
      }
      if (char(a) == char(j)) {
        count = count + 1
      }
    }
    if (count > 0) {
      println("\t" + char(i) + "\t\t\t" + count)
    }
  }
}
