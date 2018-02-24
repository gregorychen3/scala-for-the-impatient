import java.time.LocalDate

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

class Ch2Ex10Test extends FunSuite {
  test("2 to the power of 2 should be 4") {
    assert(Ch2Helpers.myPow(2, 2) == 4)
  }

  test("2 to the power of 1 should be 2") {
    assert(Ch2Helpers.myPow(2, 1) == 2)
  }

  test("2 to the power of 3 should be 8") {
    assert(Ch2Helpers.myPow(2, 3) == 8)
  }

  test("2 to the power of 0 should be 1") {
    assert(Ch2Helpers.myPow(2, 0) == 1)
  }

  test("2 to the power of -1 should be .5") {
    assert(Ch2Helpers.myPow(2, -1) == .5)
  }

  test("2 to the power of -3 should be .125") {
    assert(Ch2Helpers.myPow(2, -3) == .125)
  }

  test("2 to the power of -2 should be .25") {
    assert(Ch2Helpers.myPow(2, -2) == .25)
  }
}

class Ch2Ex11Test extends FunSuite {
  test("DateInterpolator should create date 2012-01-22") {
    assert(date"${2012}-${1}-${22}" == LocalDate.of(2012, 1, 22))
  }
}
