object Test {
  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String)(formatFn: String => String): String = {
    formatFn(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    println(formatNames(names(0))(toUpper))
    println(formatNames(names(1))(str => toUpper(str.slice(0, 2)) + toLower(str.slice(2, 8))))
    println(formatNames(names(2))(toLower))
    println(formatNames(names(3))(str => str.dropRight(1) + str.last.toUpper))
  }
}
