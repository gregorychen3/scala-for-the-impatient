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
