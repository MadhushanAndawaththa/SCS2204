
object calculateSquare {
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val SquareNumbers = calculateSquare(inputList)
    println(SquareNumbers)
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number* number)
  }
}
