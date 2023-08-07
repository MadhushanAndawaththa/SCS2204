object FilterPrime {
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    println(primeNumbers)
  }

  def isPrime(n: Int, i: Int = 2): Boolean = {
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

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => isPrime(number))
  }
}
