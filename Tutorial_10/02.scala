
object CountLetters {
  def main(args: Array[String]): Unit = {
    val input = List("apple", "banana", "cherry", "date")
    val letterCounts = countLetters(input)
    val totalLetterCount = letterCounts.reduce( (a, b) => a + b)
    println(s"Total Letter Count: $totalLetterCount")
  }

  def countLetters(words: List[String]): List[Int] = {
    words.map(word => word.length)
  }
}
