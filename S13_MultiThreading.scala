package MyLearning

class Demo extends Thread {
  override def run(): Unit = {
    for (i <- 1 to 6) {
      println("Vishal")
      Thread.sleep(3000)
    }
  }
}

object S13_MultiThreading {
  def main(args: Array[String]): Unit = {
    val result = new Demo()
    result.start()

    for (i <- 1 to 6) {
      println("Rajat")
//      Thread.sleep(3000)

    }
  }

}
