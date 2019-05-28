//package purert
//
//import scala.collection.mutable.ArrayBuffer
//
///*
//* This class has following problems:
//** All of its fields are mutable
//** All of the set methods mutate the class fields
//** The getHistory method returns a mutable data structure
//* */
//
//
//class BadStock(var symbol: String, var company: String,
//               var price: BigDecimal, var volume: Long) {
//  var html: String = _
//
//  def buildUrl(stockSymbol: String): String = { ... }
//
//  def getUrlContent(url: String):String = { ... }
//
//  def setPriceFromHtml(html: String) { this.price = ... }
//
//  def setVolumeFromHtml(html: String) { this.volume = ... }
//
//  def setHighFromHtml(html: String) { this.high = ... }
//
//  def setLowFromHtml(html: String) { this.low = ... }
//
////   some dao-like functionality
//  private val _history: ArrayBuffer[Stock] = { ... }
//
//  val getHistory = _history
//}
//
