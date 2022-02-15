package MyLearning.ArraysQuestions

object A2_CheckNumPresentOrNot {

  def check(x: Int, nums: Array[Int]): Boolean = {
    if (nums.length < 1) false
    else
      nums.head == x || nums.last == x
  }


  def main(args: Array[String]): Unit = {
    println("check if given num is present in first and last position in an array!")
    val list1 = Array(1, 2, 3, 4, 5, 6)
    val findNum = 6
    println(s"Given number is : ${findNum}")
    println("check " + check(findNum, list1))

    val list2 = Array(2, 3, 4, 9, 10, 13, 15, 18, 33, 39)
    val find = 3
    println(s"Given number is : ${find}")
    println("check " + check(find, list2))


    //using contains method
    val list3= Array(34,56,78,12,34,98,41,20,21,8)
    val filter= list3.contains(56)
    println(filter)

    
  }

}
