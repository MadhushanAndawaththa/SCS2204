object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

    val typeof: Int => String = {
      case x if x <= 0 => "Negative/Zero"
      case x if x % 2 == 0 => "Even"
      case _ => "Odd"
    }

    println("Enter the number:")
    val number = StdIn.readInt()
    val type1 = typeof(number)
    println(s"type: $type1")
  }
}
