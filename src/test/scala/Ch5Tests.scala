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
