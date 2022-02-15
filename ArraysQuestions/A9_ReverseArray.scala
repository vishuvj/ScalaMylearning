package MyLearning.ArraysQuestions

object A9_ReverseArray {
  def reverseFunction(num: Array[Int]): Array[Int] = {
    var temp1 = 0;
    var temp2 = 0;
    var li = 0
    var hi = num.length - 1
    while (li < hi) {
      temp1 = num(li)
      temp2 = num(hi)
      num(li) = temp2
      num(hi) = temp1
      li += 1
      hi -= 1
    }
    num
  }

  def main(args: Array[String]): Unit = {
    var t = 0
    var n = 0
    val list = Array(1, 45, 32, 7, 9, 12, 56, 32, 89, 64, 71)
//    for (x <- list) {
//      print(s"${x}, ")
//    }

  for (i <- 0 to list.length-1){
      if (list(i) > list(i + 1)) {
        var tempVal: Int = list(i)
        list(i) = list(i + 1)
        list(i + 1) = tempVal
      }
    }





    val result1 = reverseFunction(list)
    for (x <- result1) {
      print(s"${x}, ")
    }
  }
}
