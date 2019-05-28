package patternmatching

sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture

object SealedClasses {

  def main(args: Array[String]): Unit = {
    val couch = Couch()
    val chair = Chair()

    println(findPlaceToSit(couch))
    println(findPlaceToSit(chair))
  }

  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }
}
