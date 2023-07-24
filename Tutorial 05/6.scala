object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    def fibonacci(n: Int): Unit = {
      def fibonacciHelper(a: Int, b: Int, count: Int): Unit = {
        if (count <= n) {
          println(a)
          fibonacciHelper(b, a + b, count + 1)
        }
      }

      fibonacciHelper(0, 1, 1)
    }

    println("Enter an Int:")
    val input = StdIn.readInt()
    fibonacci(input)
  }
}