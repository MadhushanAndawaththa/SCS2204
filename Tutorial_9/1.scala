class Rational(n: Int, d: Int) {
  val numer: Int = n
  val denom: Int = d

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"
}

object Rational {
  def apply(n: Int, d: Int): Rational = new Rational(n, d)
}

object RationalNumberExample {
  def main(args: Array[String]): Unit = {
    val x = Rational(3, 4)
    val negX = x.neg
    println(negX)
  }
}