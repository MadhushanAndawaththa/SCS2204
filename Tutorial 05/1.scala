
object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    def isPrime(n: Int, i: Int= 2): Boolean = {
  if (n <= 1) {
    false
  } else if (n == 2) {
    true
  } else if (i * i > n) {
    true
  } else if (n % i == 0) {
    false
  } else {
    isPrime(n, i + 1)
  }
}

    println("Enter an Int:")
    val input = StdIn.readInt()
    val output = isPrime(input)
    println(output)
  }
}