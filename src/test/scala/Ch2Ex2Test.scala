import org.scalatest._
import Ch2Helpers._

class Ch2Ex1Test extends FunSuite {
  test("The signum of a negative Int should be -1") {
    val i: Int = -1
    assert(Ch2Helpers.getSignum(i) == -1)
  }

  test("The signum of a negative Double should be -1") {
    val i: Double = -1
    assert(Ch2Helpers.getSignum(i) == -1)
  }

  test("The signum of the Int 0 should be 0") {
    val i: Int = 0
    assert(Ch2Helpers.getSignum(i) == 0)
  }

  test("The signum of the Double 0 should be 0") {
    val i: Double = 0
    assert(Ch2Helpers.getSignum(i) == 0)
  }

  test("The signum of a positive Int should be 1") {
    val i: Int = 1
    assert(Ch2Helpers.getSignum(i) == 1)
  }

  test("The signum of a positive Double should be 1") {
    val i: Double = 1
    assert(Ch2Helpers.getSignum(i) == 1)
  }
}

class Ch2Ex5Test extends FunSuite {
  test("Countdown from 0 should be 0") {
    val n = 0
    assert(Ch2Helpers.countdown(n) == "0")
  }

  test("Countdown from 1 should be 10") {
    val n = 1
    assert(Ch2Helpers.countdown(n) == "10")
  }

  test("Countdown from 2 should be 210") {
    val n = 2
    assert(Ch2Helpers.countdown(n) == "210")
  }
}

class Ch2Ex6Test extends FunSuite {
  test("The product of chars in Unicode of Hello should be 9415087488L") {
    val myStr = "Hello"
    assert(Ch2Helpers.getProductOfUnicodes(myStr) == 9415087488L)
  }
}

class Ch2Ex7Test extends FunSuite {
  test("The product of chars in Unicode of Hello should be 9415087488L") {
    val myStr = "Hello"
    assert(Ch2Helpers.getProductOfUnicodesNoLoop(myStr) == 9415087488L)
  }
}

class Ch2Ex8Test extends FunSuite {
  test("The product of chars in Unicode of Hello should be 9415087488L") {
    val myStr = "Hello"
    assert(Ch2Helpers.product(myStr) == 9415087488L)
  }
}

class Ch2Ex9Test extends FunSuite {
  test("The product of chars in Unicode of Hello should be 9415087488L") {
    val myStr = "Hello"
    assert(Ch2Helpers.productRecursive(myStr) == 9415087488L)
  }
}