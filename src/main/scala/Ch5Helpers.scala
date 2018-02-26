class Counter {
  private var value = 0
  def increment(): Unit = {
    if (value < Int.MaxValue) value += 1
  }
  def current() = value
}

class BankAccount {
  private var privateBalance = 0.0

  def balance = privateBalance

  def deposit(amount: Double) = {
    privateBalance += amount
  }

  def withdraw(amount: Double) = {
    privateBalance -= amount
  }
}