package MyLearning.StringQuestions

object OddEvenNum extends App{
  val num= 4566

  var odd=0
  var even=0
  var temp=1
  while(num !=0)
    {
      if(temp%2==0)
        {
         even +=num%10
        }
      else {
        odd +=num%10
      }
      num/10
      temp+1
    }

    println(odd)
    println(even)

}
