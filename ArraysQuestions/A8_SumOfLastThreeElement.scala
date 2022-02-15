package MyLearning.ArraysQuestions

//sum of the last 3 elements of an array of integers.
// If the array length is less than 3 then return the sum of the array
//Return 0 if the array is empty.
object A8_SumOfLastThreeElement {
  def sumLastThree(arr: Array[Int]): Int = {
    if (arr.length < 1) 0
    else if (arr.length > 0 && arr.length < 3) arr.sum
    else arr.takeRight(3).sum
  }

  def main(args: Array[String]): Unit = {

    val list1 = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Sum of last three element is " + sumLastThree(list1))

    val list2 = Array(1, 2, 3)
    println("Sum of all element of an array " + sumLastThree(list2))
  }

}
// take method utilized to take the first n element from the  list
