import org.scalatest.FunSuite

class Ch7Ex3Test extends FunSuite {
  test("Ch7Ex3Random.nextInt should return an Int") {
    assert(Ch7Ex3Random.nextInt().isInstanceOf[Int])
  }
  test("Ch7Ex3Random.nextDouble() should return a Double") {
    assert(Ch7Ex3Random.nextDouble().isInstanceOf[Double])
  }
}
