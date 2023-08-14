object StringFormattingExample {
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val toUpper: String => String = str => str.toUpperCase()
    val toLower: String => String = str => str.toLowerCase()

    val formatNames: (String, String => String) => String = (name, formatFn) => formatFn(name)

    println(formatNames(names(0), toUpper))
    println(formatNames(names(1), str => str.head.toUpper + str.tail))
    println(formatNames(names(2), toLower))
    println(formatNames(names(3), str => str.dropRight(1) + str.last.toUpper))
  }
}
