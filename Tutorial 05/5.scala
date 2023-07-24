
object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    def sumEven(n: Int): Int = {
  if (n <= 2) {
    0
  } else if (n % 2 == 0) {
    n - 2 + sumEven(n - 2)
  } else {
    n - 1 + sumEven(n - 1)
  }
}

    println("Enter an Int:")
    val input = StdIn.readInt()
    val output = sumEven(input)
    println(output)

  }
}