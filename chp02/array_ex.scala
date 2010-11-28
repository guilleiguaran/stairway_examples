def pow(x: Int): Int = { x*x }
def printlnPow(x: Int): Unit = { println(pow(x)) }

val nums = Array(1, 2, 3, 4)

//nums.foreach((x: Int) => println(pow(x)))
nums.foreach(printlnPow)