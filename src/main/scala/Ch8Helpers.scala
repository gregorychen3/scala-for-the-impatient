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

class SavingsAccount(initialBalance: Double, val monthlyInterestRate: Double) extends BankAccount(initialBalance) {

  var numRemainingTransactions = SavingsAccount.TransactionsPerMonth

  override def deposit(amount: Double) = {
    numRemainingTransactions -= 1
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    numRemainingTransactions -= 1
    super.withdraw(amount)
  }

  def earnMonthlyInterest() {
    deposit(currentBalance * monthlyInterestRate)
    numRemainingTransactions = SavingsAccount.TransactionsPerMonth
  }
}

object SavingsAccount {
  val TransactionsPerMonth = 3
}

abstract class Item() {
  def price: Double

  def description: String
}

class SimpleItem(override val price: Double, override val description: String) extends Item() {}

class Bundle extends Item() {
  private val items = new collection.mutable.ArrayBuffer[Item]()

  def price = items.foldLeft(0.0)(_ + _.price)

  def description = items.map(_.description).mkString("[", ", ", "]")

  def add(i: Item): Unit = {
    items += i
  }
}

class Point(val x: Double, val y: Double) {}

class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y) {}

abstract class Shape {
  def centerPoint: Point
}

class Rectangle(val topRight: Point, val topLeft: Point, val bottomLeft: Point, val bottomRight: Point) extends Shape {
  override def centerPoint: Point = new Point((topLeft.x + topRight.x) / 2.0, (topLeft.y + bottomLeft.y) / 2)
}

class Circle(override val centerPoint: Point, val radius: Double) extends Shape {}