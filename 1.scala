object CaesarCipher {
  def encrypt(text: String, shift: Int): String = {
    text.map { c =>
      if (c.isLetter) {
        val base = if (c.isUpper) 'A' else 'a'
        val shiftedChar = ((c - base + shift) % 26 + 26) % 26 + base
        shiftedChar.toChar
      } else {
        c 
      }
    }
  }

  def decrypt(encryptedText: String, shift: Int): String = {
    encrypt(encryptedText, -shift)
  }

  def cipher(text: String, shift: Int, processFunc: (String, Int) => String): String = {
    processFunc(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val originalText = "Hello, World!"
    val shift = 3

    println(s"Original Text: $originalText")
    val encryptedText = cipher(originalText, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")
    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText")
  }
}
