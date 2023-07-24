object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

        def typeof(n:Int): String= n match {
        case x if(x <=0) => "Negative/Zero"
        case x if(x %2 == 0) => "Even"
        case _ => "Odd"
    }

    println("Enter the number:")
    val number = StdIn.readInt()
    val type1 = typeof(number)
    println("interest: " + type1)
  }
}
