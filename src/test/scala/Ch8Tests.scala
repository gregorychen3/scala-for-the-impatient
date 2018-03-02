import org.scalatest._

class Ch8Ex1Test extends FunSuite {
  test("BankAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val ba = new Ch8.BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)
  }
}