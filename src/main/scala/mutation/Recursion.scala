package mutation

import scala.annotation.tailrec

/*
* Avoiding Mutation, in case of Accumulation
** Recursion
** Folding
* */


object Recursion {
  def main(args: Array[String]) {
//    val list = List(1, 2, 3, 4, 5)
//    println(sumRecursively(list))
    println(factorial(5))
  }

  def sumRecursively(list: List[Int]): Int = {
    def recurse(list: List[Int], acc: Int): Int = {
      if (list.isEmpty) acc
      else recurse(list.tail, acc + list.head)
    }

    recurse(list, 0)
  }

//  def factorial_tail(n: Int):Int = {
//    @tailrec
    def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
//      print(0)
//      acc
    }
//    factorialAcc(1, n)
//  }

//  @tailrec
  def factorial(n:Int): Int = {
    if(n<=1) n
    else factorial(n-1)
    print(0)
    0
//    0
  }

}
