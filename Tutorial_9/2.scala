class rational(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d

  def sub(that: rational): rational = new rational(
    numer * that.denom - that.numer * denom,
    denom * that.denom
  )

  override def toString: String = s"$numer/$denom"
}

object rationalNumberExample {
  def main(args: Array[String]): Unit = {
    val x = new rational(3, 4)
    val y = new rational(5, 8)
    val z = new rational(2, 7)
    
    val result = x.sub(y).sub(z)
    println(result)
  }
}
