import org.scalatest._

class Ch8Ex1Test extends FunSuite {
  test("BankAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)
  }

  test("Withdrawing from BankAccount should withdraw") {
    val initialBalance = 100
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)

    val withdrawAmount = 1
    ba.withdraw(withdrawAmount)
    assert(ba.currentBalance == initialBalance - withdrawAmount)
  }

  test("Depositing to BankAccount should deposit") {
    val initialBalance = 100
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)

    val depositAmount = 1
    ba.deposit(depositAmount)
    assert(ba.currentBalance == initialBalance + depositAmount)
  }

  test("CheckingAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val ca = new Ch8.CheckingAccount(initialBalance)
    assert(ca.currentBalance == initialBalance)
  }

  test("Withdrawing from CheckingAccount should withdraw with transaction fee") {
    val initialBalance = 100
    val ca = new Ch8.CheckingAccount(initialBalance)
    assert(ca.currentBalance == initialBalance)

    val withdrawAmount = 1
    ca.withdraw(withdrawAmount)
    assert(ca.currentBalance == initialBalance - withdrawAmount - Ch8.CheckingAccount.TransactionFee)
  }

  test("Depositing to CheckingAccount should deposit with transaction fee") {
    val initialBalance = 100
    val ca = new Ch8.CheckingAccount(initialBalance)
    assert(ca.currentBalance == initialBalance)

    val depositAmount = 1
    ca.deposit(depositAmount)
    assert(ca.currentBalance == initialBalance + depositAmount - Ch8.CheckingAccount.TransactionFee)
  }
}