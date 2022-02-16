package MyLearning.MyQuestions

object ArmStrongNumbers extends App {
  var number = 153
  var tempNumberOne = number;
  var numberLength = 0

  // for checking number length
  while (tempNumberOne != 0) {
    tempNumberOne = tempNumberOne / 10
    numberLength = numberLength + 1
  }
  println("The length of the number : " + numberLength)

  //for checking number is armString or not
  var tempNumberTwo = number
  var armStrong = 0;
  var remainder = 0;

  while (tempNumberTwo != 0) {
    var mul = 1
    remainder = tempNumberTwo % 10
    mul = mul * remainder * remainder * remainder
    armStrong = armStrong + mul
    tempNumberTwo = tempNumberTwo / 10
  }

  if (number == armStrong) {
    println(number + " is armstrong")
  } else {
    println(number + " is not armstrong")
  }

}
//1*1*1+5*5*5+3*3*3=153 those numbers whose multiply is similar as a number that number is called Armstrong number.