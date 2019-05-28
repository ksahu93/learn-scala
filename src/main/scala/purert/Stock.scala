package purert

import java.util.Date

case class Stock(symbol: String, company: String)

//Stock("AAPL", "Apple")


case class StockInstance(symbol: String, price: BigDecimal, volume: Long, dateTime: String, high: String, low: String)

//StockInstance("AAPL", "Nov. 2, 2012 5:00pm", 576.80, 20431707)

//This method takes a URL as a parameter and returns the HTML content from that URL.
object NetworkUtils {
  def getUrlContent(url: String): String = {
    /*...*/ url
  }
}

//Similarly, the ability to build a URL from a stock symbol should be moved to an object.
// Because this behavior is specific to a stock, you’ll put it in an object named StockUtils.

//The methods getPrice, getVolume, getHigh, and getLow are all pure functions:
// given the same HTML string and stock symbol, they will always return the same values,
// and they don’t have side effects.
object StockUtils {
  def buildUrl(stockSymbol: String): String = {
    /*...*/ s"https://www.stock.com/${stockSymbol}"
  }

  def getPrice(html: String): BigDecimal = {
    /*...*/ 20.0
  }

  def getVolume(symbol: String, html: String): String = {
    /*...*/ html
  }

  def getHigh(symbol: String, html: String): String = {
    /*...*/ html
  }

  def getLow(symbol: String, html: String): String = {
    /*...*/ html
  }
}

object DateUtils {
  def currentDate: String = {
    new Date().toString
  }

  def currentTime: String = {
    new Date().getTime().toString
  }
}

/*
* With this new design, you create an instance of a Stock for the current date and time as a simple series of expressions.
 * First, retrieve the HTML that describes the stock from a web page:
* */
class StockDemo {
  def main(args: Array[String]): Unit = {
    val stock = new Stock("AAPL", "Apple")
    val url = StockUtils.buildUrl(stock.symbol)
    val html = NetworkUtils.getUrlContent(url)

    val price = StockUtils.getPrice(html)
    val volume = StockUtils.getVolume(stock.symbol, html).toLong
    val high = StockUtils.getHigh(stock.symbol, html)
    val low = StockUtils.getLow(stock.symbol, html)
    val date = DateUtils.currentDate
    val stockInstance = StockInstance(stock.symbol, price, volume, date, high, low)
  }

}

object StockDao {
  def getStockInstances(symbol: String): Vector[StockInstance] = {
    Vector(StockInstance("ABC", 10, 10l, DateUtils.currentDate, "20", "4"),
      StockInstance("ABC", 10, 10l, DateUtils.currentDate, "20", "4"))
  }
}