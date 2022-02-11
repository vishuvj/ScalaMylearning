package MyLearning
//String interpolation s / f / raw
object S2_String_Interpolation {
  def main(args: Array[String]): Unit = {
    val name = "Vishal"
    val age = 23
    // String interpolation first method
    println(name + " is " + age + " years old.");

    println(s"$name is $age years old.")

    // String interpolation second method
    println(f"$name%s is $age%d years old.")

    println("Hello \nWorld")
    println("Hello \nWorld")
  }

}
