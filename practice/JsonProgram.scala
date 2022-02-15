package MyLearning.practice


import io.circe._
import io.circe.parser._
import io.circe.syntax._
import io.circe.generic.auto._
import io.circe.generic.semiauto.deriveDecoder


case class JsonCaseClass(firstName: String, lastName: String, phoneNo: String, title: String)
object JsonProgram extends App {
  val jsonString =
    """
      |{
      |"firstName" : "Vishal",
      |"lastName" : "Thakur",
      |"phoneNo" : "9000581222",
      |"title" : "Student"
      |
      |}""".stripMargin

  println("_" * 100) //print 100 hyphen
  val parseResult: Either[Error, JsonCaseClass] = {
    parser.parse(jsonString).flatMap(Decoder[JsonCaseClass].decodeJson)
    decode[JsonCaseClass](jsonString)
  }
  println(parseResult.getOrElse(Nil))

  //   val convertObjectToJson = parseResult.asJson
  implicit val jsonDecoder: Decoder[JsonCaseClass] = deriveDecoder[JsonCaseClass]
  val decoded = decode[JsonCaseClass](jsonString)
  println(decoded)

}
