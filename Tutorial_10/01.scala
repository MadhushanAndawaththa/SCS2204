
object CalculateAverage {
  def main(args: Array[String]): Unit = {
    val input = List(0, 10, 20, 30)
    val fahrenheitTemperatures = calculateAverage(input)
    val averageFahrenheit = fahrenheitTemperatures.reduce( (a, b) => a + b) / fahrenheitTemperatures.length
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }

  def calculateAverage(numbers: List[Int]): List[Double] = {
    numbers.map(number => (number * 9/5) + 32.toDouble)
  }
}
