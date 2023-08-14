object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    val interest: Int => Double = (amount) => {
      if (amount <= 20000) {
        amount * 0.02
      } else if (amount <= 200000) {
        amount * 0.04
      } else if (amount <= 2000000) {
        amount * 0.035
      } else {
        amount * 0.065
      }
    }

    println("Enter the amount:")
    val amount = StdIn.readInt()
    val calculatedInterest = interest(amount)
    println(s"Interest: $calculatedInterest")
  }
}
