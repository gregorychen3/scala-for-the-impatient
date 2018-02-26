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
