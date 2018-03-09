import Ch8._
import org.scalatest._

class Ch8Ex1Test extends FunSuite {

  test("BankAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val ba = new BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)
  }

  test("Withdrawing from BankAccount should withdraw") {
    val initialBalance = 100
    val ba = new BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)

    val withdrawAmount = 1
    ba.withdraw(withdrawAmount)
    assert(ba.currentBalance == initialBalance - withdrawAmount)
  }

  test("Depositing to BankAccount should deposit") {
    val initialBalance = 100
    val ba = new BankAccount(initialBalance)
    assert(ba.currentBalance == initialBalance)

    val depositAmount = 1
    ba.deposit(depositAmount)
    assert(ba.currentBalance == initialBalance + depositAmount)
  }
}

class Ch8Ex2Test extends FunSuite {

  test("CheckingAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val ca = new CheckingAccount(initialBalance)
    assert(ca.currentBalance == initialBalance)
  }

  test("Withdrawing from CheckingAccount should withdraw with transaction fee") {
    val initialBalance = 100
    val ca = new CheckingAccount(initialBalance)
    assert(ca.currentBalance == initialBalance)

    val withdrawAmount = 1
    ca.withdraw(withdrawAmount)
    assert(ca.currentBalance == initialBalance - withdrawAmount - CheckingAccount.TransactionFee)
  }

  test("Depositing to CheckingAccount should deposit with transaction fee") {
    val initialBalance = 100
    val ca = new CheckingAccount(initialBalance)
    assert(ca.currentBalance == initialBalance)

    val depositAmount = 1
    ca.deposit(depositAmount)
    assert(ca.currentBalance == initialBalance + depositAmount - CheckingAccount.TransactionFee)
  }
}

class Ch8Ex3Test extends FunSuite {

  test("SavingsAccount constructor with initialBalance") {
    val initialBalance = 1.1
    val MonthlyInterestRate = 0.03
    val sa = new SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth)
  }

  test("Withdrawing from SavingsAccount should withdraw with transaction fee") {
    val initialBalance = 100
    val MonthlyInterestRate = 0.03
    val sa = new SavingsAccount(initialBalance, MonthlyInterestRate)
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
    val sa = new SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)

    val depositAmount = 1
    sa.deposit(depositAmount)
    assert(sa.currentBalance == initialBalance + depositAmount)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth - 1)
  }

  test("SavingsAccount should getInterest") {
    val initialBalance = 100
    val MonthlyInterestRate = 0.03
    val sa = new SavingsAccount(initialBalance, MonthlyInterestRate)
    assert(sa.currentBalance == initialBalance)

    sa.earnMonthlyInterest()
    assert(sa.currentBalance == initialBalance + initialBalance * MonthlyInterestRate)
    assert(sa.numRemainingTransactions == SavingsAccount.TransactionsPerMonth)
  }
}

class Ch8Ex4Test extends FunSuite {
  test("Construct a SimpleItem") {
    val Price = 100
    val Description = "Tchotchke"
    val simpleItem = new SimpleItem(Price, Description)
    assert(simpleItem.price == Price)
    assert(simpleItem.description == Description)
  }

  test("Construct empty Bundle") {
    val bundle = new Bundle;
    assert(bundle.description == "[]")
    assert(bundle.price == 0)
  }

  test("Bundle with a single Item") {
    val bundle = new Bundle
    val Price = 100
    val Description = "Tchotchke"
    bundle.add(new SimpleItem(Price, Description))
    assert(bundle.description == "[Tchotchke]")
    assert(bundle.price == Price)
  }

  test("Bundle with a multiple Items") {
    val bundle = new Bundle

    val Price1 = 100
    val Description1 = "Tchotchke"

    val Price2 = 200
    val Description2 = "Thing"

    bundle.add(new SimpleItem(Price1, Description1))
    bundle.add(new SimpleItem(Price2, Description2))
    assert(bundle.description == "[Tchotchke, Thing]")
    assert(bundle.price == Price1 + Price2)
  }
}

class Ch8Ex5Test extends FunSuite {
  test("Contruct a Point") {
    val X = 1
    val Y = 2
    val point = new Point(X, Y)
    assert(point.x == X)
    assert(point.y == Y)
  }

  test("Construct a LabeledPoint") {
    val X = 1
    val Y = 2
    val Label = "Foo"
    val labeledPoint = new LabeledPoint(Label, X, Y)
    assert(labeledPoint.label == Label)
    assert(labeledPoint.x == X)
    assert(labeledPoint.y == Y)
  }
}

class Ch8Ex6Test extends FunSuite {
  test("Rectangle constructor") {
    val topLeft = new Ch8.Point(2, 4)
    val topRight = new Ch8.Point(4, 4)
    val bottomLeft = new Ch8.Point(2, 2)
    val bottomRight = new Ch8.Point(4, 2)
    val r = new Rectangle(topLeft = topLeft, topRight = topRight, bottomLeft = bottomLeft, bottomRight = bottomRight)
    assert(r.centerPoint.x == 3)
    assert(r.centerPoint.y == 3)
  }
  
  test("Circle constructor") {
    val center = new Ch8.Point(2, 2)
    val radius = 3
    val r = new Circle(center, radius)
    assert(r.centerPoint.x == 2)
    assert(r.centerPoint.y == 2)
    assert(r.radius == 3)
  }
}