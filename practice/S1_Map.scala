package MyLearning.practice

import scala.Vector

object S1_Map {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6)


    //sqaure of list
    print("_" * 100)
    println
    val sqaureOfList = list1.map({ x => x * 2 })
    println(sqaureOfList)

    //cube of list
    print("_" * 100)
    println
    val cubeOfList = list1.map(_ * 3)
    println(cubeOfList)

    //until
    print("_" * 100)
    println
    val vector = (0 until 5).map((_ * 2))
    println(vector)

    //map in set
    print("_" * 100)
    println
    val list2 = Set(1, 2, 2, 3, 4).map(_ * 2)
    println(list2)

    //Map
    print("_" * 100)
    println
    val list3 = Map("Key1" -> 1, "Key2" -> 2).map({ KeyValue: (String, Int) =>
      KeyValue
      match {
        case (key, value) => (key, value * 2)
      }
    })
    println(list3)

    //string
    print("_" * 100)
    println
    val str = "vishal".map(_.toUpper)
    println(str)

    //add fee in cost
    print("_" * 100)
    println
    val fee = 1.25
    val cost = Some(4.5)
    val finalCostUsingMap = cost.map(_ + fee)
    println("finalCostUsingMap " + finalCostUsingMap)
    //using flatmap
    val finalCostUsingFlatmap = cost.flatMap(x => if (x < 1.00) None else Some(x + fee))
    println("finalCostUsingFlatmap " + finalCostUsingFlatmap)


  }

}
