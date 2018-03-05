import Ch8.SavingsAccount
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
}

class Ch8Ex2Test extends FunSuite {

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

class Ch8Ex3Test extends FunSuite {

  test("SavingsAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val MonthlyInterestRate = 0.03
    val sa = new Ch8.SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth)
  }

  test("Withdrawing from SavingsAccount should withdraw with transaction fee") {
    val initialBalance = 100
    val MonthlyInterestRate = 0.03
    val sa = new Ch8.SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth)

    val withdrawAmount = 1
    sa.withdraw(withdrawAmount)
    assert(sa.currentBalance == initialBalance - withdrawAmount)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth - 1)
  }

  test("Depositing to SavingsAccount should deposit with transaction fee") {
    val initialBalance = 100
    val MonthlyInterestRate = 0.03
    val sa = new Ch8.SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)

    val depositAmount = 1
    sa.deposit(depositAmount)
    assert(sa.currentBalance == initialBalance + depositAmount)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth - 1)
  }

  test("SavingsAccount should getInterest") {
    val initialBalance = 100
    val MonthlyInterestRate = 0.03
    val sa = new Ch8.SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)

    sa.earnMonthlyInterest()
    assert(sa.currentBalance == initialBalance + initialBalance * MonthlyInterestRate)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth)
  }
}
