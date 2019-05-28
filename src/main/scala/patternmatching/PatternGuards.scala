package patternmatching

/*
* Pattern guards are simply boolean expressions which are used to make cases more specific.
 * Just add if <boolean expression> after the pattern.
* */
object PatternGuards {

  def main(args: Array[String]): Unit ={
    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val someSms = SMS("867-5301", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    println(showImportantNotification(someSms, importantPeopleInfo))
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo))
    println(showImportantNotification(importantEmail, importantPeopleInfo))
    println(showImportantNotification(importantSms, importantPeopleInfo))
  }

  def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
    notification match {
      case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
        "You got an email from special someone!"
      case SMS(number, _) if importantPeopleInfo.contains(number) =>
        "You got an SMS from special someone!"
      case other =>
        PatternMatching.showNotification(other) // nothing special, delegate to our original showNotification function
    }
  }

}
