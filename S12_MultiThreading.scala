package MyLearning


class SecondThread extends Runnable {
  override def run(): Unit = {
    println("Thread " + Thread.currentThread().getName() + " is running")
  }
}

object S12_MultiThreading {
  def main(args: Array[String]): Unit = {
    for (x <- 1 to 5) {
      var th = new Thread(new SecondThread())
      th.setName(x.toString)
      th.start()

    }
  }

}
