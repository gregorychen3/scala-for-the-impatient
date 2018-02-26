import org.scalatest._

class Ch4Ex1Test extends FunSuite {
  test("Gizmo prices should be discounted by 10 percent") {
    val gizmosToPrices = Map("computer" -> 12.12, "phone" -> 123.123)
    val gizmosToDiscountedPrices = Ch4Helpers.produceDiscount(gizmosToPrices)
    assert(gizmosToPrices.keySet == gizmosToDiscountedPrices.keySet)
    for((k,v) <- gizmosToPrices) {
      assert(gizmosToDiscountedPrices(k) == v - v * .1)
    }
  }
}
