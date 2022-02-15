package MyLearning.ArraysQuestions

object A6_RemoveElementFromArray extends App {

  val colors = Array("Red", "Blue", "Green", "Pink")

  for(x<- colors)
    {
      print(s"${x}, ")
    }
println
  //Replace color with white
  colors(0)="White"
  //remove color from an array
  colors(1)=""

   for(x<- colors)
    {
      print(s"${x}, ")
    }

}
