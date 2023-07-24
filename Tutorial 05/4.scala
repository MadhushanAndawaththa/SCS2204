
object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    def isEven(n: Int): String = {
  if (n == 0) {
    "Even"
  } else if (n == 1) {
    "Odd"
  } else {
    isEven(n - 2)
  }
}

    println("Enter an Int:")
    val input = StdIn.readInt()
    val output = isEven(input)
    println(output)

  }
}