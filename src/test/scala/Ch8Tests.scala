import org.scalatest._

class Ch8Ex1Test extends FunSuite {
  test("BankAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)
  }

  test("Withdrawing from BankAccount should change balance") {
    val initialBalance = 100
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)

    val withdrawAmount = 1
    ba.withdraw(withdrawAmount)
    assert(ba.currentBalance == initialBalance - withdrawAmount)
  }

  test("Depositing to BankAccount should change balance") {
    val initialBalance = 100
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)

    val depositAmount = 1
    ba.deposit(depositAmount)
    assert(ba.currentBalance == initialBalance + depositAmount)
  }
}