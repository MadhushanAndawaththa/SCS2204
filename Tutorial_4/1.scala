object VariableExpressions {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn

        def interest(n:Int=2): Double = n match {
        case x if(x <=20000) => n*2/100
        case x if(x <=200000) => n*4/100
        case x if(x <=2000000) => n*3.5/100
        case x if(x >2000000) => n*6.5/100
    }

    println("Enter the amount:")
    val amount = StdIn.readInt()
    val interest1 = interest(amount)
    println("interest: " + interest1)
  }
}
