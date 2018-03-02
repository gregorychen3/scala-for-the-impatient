package Ch5Helpers

import scala.beans.BeanProperty

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

class Student(@BeanProperty var name: String) {}

class Person(var age: Int) {
  age = if (age < 0) 0 else age
}

class Person2(name: String) {
  val firstName = name.split(' ')(0)
  val lastName = name.split(' ')(1)
}

class Car(val manufacturer: String, val modelName: String, val modelYear: Int, var licensePlate: String) {
  def this(manufacturer: String, modelName: String) {
    this(manufacturer, modelName, -1, "")
  }

  def this(manufacturer: String, modelName: String, modelYear: Int) {
    this(manufacturer, modelName, modelYear, "")
  }

  def this(manufacturer: String, modelName: String, licensePlate: String) {
    this(manufacturer, modelName, -1, licensePlate)
  }
}

class Employee(val name: String, var salary: Double) {
  def this() {
    this("John Q. Public", 0.0)
  }
}

class EmployeeRewrite(inName: String = "John Q. Public", inSalary: Double = 0.0) {
  val name = inName
  var salary = inSalary
}