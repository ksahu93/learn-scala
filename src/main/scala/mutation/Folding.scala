package mutation

/*
* Folding:
*
*
* */


object Folding {
  def main(args: Array[String]) {
    //Step 1: Initialise an array of Donuts
    val donuts = List("Plain", "Strawberry", "Glazed")

    //Step 2: Create a String of all donuts using foldLeft function
    println(s"All donuts = ${donuts.foldLeft("")((a, b) => a + b + " Donut ")}")
  }

}
