class account(initialBalance: Double) {
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

  def transfer(toaccount: account, amount: Double): Unit = {
    require(amount > 0, "Amount must be positive")
    require(amount <= balance, "Insufficient balance")
    balance -= amount
    toaccount.deposit(amount)
  }

  def getBalance: Double = balance

  override def toString: String = s"Balance: $balance"
}

class Bank(accounts: List[account]) {
  def negativeBalanceaccounts: List[account] = accounts.filter(_.getBalance < 0)

  def totalBalance: Double = accounts.map(_.getBalance).sum

  def applyInterest(): Unit = {
    accounts.foreach(account => {
      val interestRate = if (account.getBalance > 0) 0.05 else 0.1
      val interest = account.getBalance * interestRate
      if (interest > 0) {
        account.deposit(interest)
      }
    })
  }
}

object BankExample {
  def main(args: Array[String]): Unit = {
    val account1 = new account(1000)
    val account2 = new account(-500)
    val account3 = new account(200)
    val accounts = List(account1, account2, account3)
    
    val bank = new Bank(accounts)
    
    println(bank.negativeBalanceaccounts)
    println(bank.totalBalance)
    bank.applyInterest()
    println(account1)
    println(account2)
    println(account3)
  }
}
