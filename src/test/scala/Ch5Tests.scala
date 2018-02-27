import org.scalatest._

class Ch5Ex1Test extends FunSuite {
  test("Counter should not wrap at Int.MaxValue") {
    val counter = new Counter
    for (i <- 0 until Int.MaxValue) counter.increment()
    assert(counter.current() >= 0)
  }
}

class Ch5Ex2Test extends FunSuite {
  test("A new BankAccount should have a balance of zero") {
    assert((new BankAccount).balance == 0.0)
  }

  test("Depositing into an empty BankAccount should be reflected in the balance") {
    val ba = new BankAccount
    ba.deposit(10)
    assert(ba.balance == 10)
  }

  test("Withdrawing from a BankAccount should be reflected in the balance") {
    val ba = new BankAccount
    ba.deposit(10)
    ba.withdraw(1)
    assert(ba.balance == 9)
  }
}

class Ch5Ex3Test extends FunSuite {
  test("The Time 12:34 should construct") {
    val time = new Time(12, 34)
    assert(time.hours == 12)
    assert(time.minutes == 34)
  }

  test("The Time 00:00 should be before 00:01") {
    assert(new Time(0, 0).before(new Time(0, 1)))
  }

  test("The Time 12:02 should be before 13:01") {
    assert(new Time(12, 2).before(new Time(13, 1)))
  }

  test("The Time 00:01 should not be before 00:00") {
    assert(!(new Time(0, 1).before(new Time(0, 0))))
  }

  test("The Time 13:01 should not be before 12:02") {
    assert(!(new Time(13, 1).before(new Time(12, 2))))
  }
}

class Ch5Ex4Test extends FunSuite {
  test("The Time 12:34 should construct") {
    val time = new Time2(12, 34)
    assert(time.hours == 12)
    assert(time.minutes == 34)
  }

  test("The Time 00:00 should be before 00:01") {
    assert(new Time2(0, 0).before(new Time2(0, 1)))
  }

  test("The Time 12:02 should be before 13:01") {
    assert(new Time2(12, 2).before(new Time2(13, 1)))
  }

  test("The Time 00:01 should not be before 00:00") {
    assert(!(new Time2(0, 1).before(new Time2(0, 0))))
  }

  test("The Time 13:01 should not be before 12:02") {
    assert(!(new Time2(13, 1).before(new Time2(12, 2))))
  }
}

class Ch5Ex5Test extends FunSuite {
  test("Student primary constructor should generate Scala getter for name field") {
    val testName = "Bob"
    val student = new Student(testName)
    assert(student.name == testName)
  }

  test("Student primary constructor should generate Scala setter for name field") {
    val testName = "Bob"
    val testName2 = "Bill"
    val student = new Student(testName)
    student.name = testName2
    assert(student.name == testName2)
  }

  test("Student primary constructor should generate Java getter for name field") {
    val testName = "Bob"
    val student = new Student(testName)
    assert(student.getName == testName)
  }

  test("Student primary constructor should generate Java setter for name field") {
    val testName = "Bob"
    val testName2 = "Bill"
    val student = new Student(testName)
    student.setName(testName2)
    assert(student.name == testName2)
  }
}

class Ch5Ex6Test extends FunSuite {
  test("Person constructor should construct a Person with age 0 when passed a negative age") {
    val testAge = -1
    val person = new Person(testAge)
    assert(person.age == 0)
  }

  test("Person constructor should construct a Person requested age when passed a positive age") {
    val testAge = 1
    val person = new Person(testAge)
    assert(person.age == testAge)
  }
}

class Ch5Ex7Test extends FunSuite {
  test("Person2 class should have a generated getter for firstName and lastName properties") {
    val testFirstName = "John"
    val testLastName = "Doe"
    val testFullName = s"$testFirstName $testLastName"
    val person = new Person2(testFullName)
    assert(person.firstName == testFirstName)
    assert(person.lastName == testLastName)
  }
}