import org.scalatest._

class Ch5Ex1Test extends FunSuite {
  test("Counter should not wrap at Int.MaxValue") {
    val counter = new Counter
    for (i <- 0 until Int.MaxValue) counter.increment()
    assert(counter.current() >= 0)
  }
}
