package Ch8

class BankAccount(initialBalance: Double) {

  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  override def deposit(amount: Double) = super.deposit(amount - CheckingAccount.TransactionFee)

  override def withdraw(amount: Double) = super.withdraw(amount + CheckingAccount.TransactionFee)
}

object CheckingAccount {
  val TransactionFee = 1
}
