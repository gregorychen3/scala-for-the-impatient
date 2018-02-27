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

class Time(val hours: Int, val minutes: Int) {
  def before(other: Time): Boolean = {
    if (hours < other.hours) true
    else if (hours == other.hours) minutes < other.minutes
    else false
  }
}

class Time2(d_hours: Int, d_minutes: Int) {
  private val minutesSinceMidnight = d_hours * 60 + d_minutes

  def hours: Int = minutesSinceMidnight / 60

  def minutes: Int = minutesSinceMidnight % 60

  def before(other: Time2): Boolean = {
    if (hours < other.hours) true
    else if (hours == other.hours) minutes < other.minutes
    else false
  }

}