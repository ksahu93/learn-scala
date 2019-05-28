package patternmatching

object MatchType {

  def main(args: Array[String]): Unit ={
    val phone = Phone("Galaxy s8")
    val iphone = Phone("Iphone X")
    val computer = Computer("Macintosh")

    List(phone, iphone, computer).map(goIdle).foreach(_())
  }

  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff _
    case c: Computer => c.screenSaverOn _
  }

}

abstract class Device
case class Phone(model: String) extends Device{
  def screenOff = println("Turning screen off")
}
case class Computer(model: String) extends Device {
  def screenSaverOn = println("Turning screen saver on...")
}
