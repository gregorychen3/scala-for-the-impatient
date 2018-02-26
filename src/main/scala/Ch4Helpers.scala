object Ch4Helpers {
  def produceDiscount(inMap: Map[String, Double]) = {
    val DISCOUNT_RATE = 0.1
    for ((k, v) <- inMap) yield (k, v - v * DISCOUNT_RATE)
  }
}
