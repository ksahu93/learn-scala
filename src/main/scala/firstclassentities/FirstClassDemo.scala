package firstclassentities

object FirstClassDemo {


  def main(args: Array[String]): Unit ={
//    val myDouble : (Int)=> Int = double
    val myDouble = double _
    val anotherDouble = myDouble

    val maxim = max _
    val maximize : (Int, Int)=>Int = max

    val salute: ()=> Unit = sayHi
  }

  def double(x: Int): Int = x * 2

  def max(a: Int, b:Int) = if (a > b) a else b

  def sayHi(): Unit = {
    println("Hello!")
  }
}
