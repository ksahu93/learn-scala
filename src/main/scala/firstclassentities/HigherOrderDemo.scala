package firstclassentities

object HigherOrderDemo {

  def isEven(i: Int) = i % 2 == 0

  def sum(a: Int, b: Int) = a + b

  def main(args: Array[String]): Unit ={
    val list = List.range(0, 10)
    val evens = list.filter(isEven)
    val add = list.foldLeft(0)(sum) //list.foldLeft(0)((a,b)=> a+b)
//    println(s"Sum $add")

    //Map Function
    val doubledList = list.map((n: Int)=>n*2)
//    doubledList.foreach(println)

    //Use addition
    println(addition(square,1,2))
  }

  //Ex1:
  def addition(f: (Int) => Int,a: Int, b:Int): Int = f(a)+f(b)

  def square(n: Int) : Int = n*n




}
