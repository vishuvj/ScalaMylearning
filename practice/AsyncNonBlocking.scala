package MyLearning.practice

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object AsyncNonBlocking {

  //Synchronous blocking
  def blockingFunction(x: Int): Int = {
    Thread.sleep(10000)
    x + 42
  }
  //     println(blockingFunction(5)) //
  //  val waiting = 42 //will wait 10 seconds before evaluating

  //Asynchronous blocking call
  def asyncBlockingFunction(x: Int): Future[Int] = Future {
    Thread.sleep(10000)
    x + 42
  }


  def main(args: Array[String]): Unit = {

 println(asyncBlockingFunction(5))
  val anotherWaiting = 43
  println(anotherWaiting)
  }
}
