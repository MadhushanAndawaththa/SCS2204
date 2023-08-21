class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
  }

  def transfer(toAccount: Account, amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
    toAccount.deposit(amount)
  }

  def getBalance: Double = balance
}

object AccountExample {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000)
    val account2 = new Account(500)
    
    account1.transfer(account2, 300)
    account1.withdraw(200)
    println(account1.getBalance)
    println(account2.getBalance)
  }
}
