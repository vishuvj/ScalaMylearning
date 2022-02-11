package MyLearning.practice


case class Person(firstName: String,
                  lastName: String,
                  title: String)

object MapMethod {
  def main(args: Array[String]): Unit = {

    val people = Seq(
      Person("Vishu", "Thakur", "Java"),
      Person("Donald", "Trump", "Scala"),
      Person("Vishal", "Thakur", "Python")
    )

    val label = people.map(Person =>
      s"${Person.title}.${Person.lastName}")

    val beginningWithV = people.filter(_.firstName.startsWith("V"))

//val firstNames = people.map(_.firstName).reduce( (a, b) => a + "," + b )

    println(label)
    println(beginningWithV)

  }

}
