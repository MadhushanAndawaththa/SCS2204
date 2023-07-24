
object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    def sum(n: Int): Int = {
  if (n <= 0) {
   0
  }
  else {
    n +sum(n-1)
  }
}

    println("Enter an Int:")
    val input = StdIn.readInt()
    val output = sum(input)
    println("Sum = "+output)

  }
}