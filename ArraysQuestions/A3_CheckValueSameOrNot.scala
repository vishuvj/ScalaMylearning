package MyLearning.ArraysQuestions

object A3_CheckValueSameOrNot {
  def check(x: Int, nums: Array[Int]): Boolean = {
    if (nums.length < 1) false
    else
      nums.head == nums.last
  }

  //check in list first and last num is same or not
  def main(args: Array[String]): Unit = {
    val list1 = Array(1, 2, 3, 4, 5, 6, 1)
    val find = 1
    println("check " + check(find, list1))
  }

}
