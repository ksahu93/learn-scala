package patternmatching

object PatternMatching {

  def main(args: Array[String]) {
    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    println(showNotification(someSms))
    println(showNotification(someVoiceRecording))
//    println(matchInt(4))
  }

  def matchInt(n: Int):String = {
    n match {
      case 1 => "once"
      case 2 => "twice"
      case 3 => "thrice"
      case _ => "many times"
    }
  }

  //Matching on case classes
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
}

abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification

case class SMS(caller: String, message: String) extends Notification

case class VoiceRecording(contactName: String, link: String) extends Notification
