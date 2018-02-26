object Ch4Helpers {
  def produceDiscount(inMap: Map[String, Double]) = {
    val DISCOUNT_RATE = 0.1
    for ((k, v) <- inMap) yield (k, v - v * DISCOUNT_RATE)
  }

  def getWordsAndCounts(inStr: String) = {
    val in = new java.util.Scanner(inStr)
    val wordCounts = collection.mutable.Map[String, Int]().withDefaultValue(0);
    while (in.hasNext) wordCounts(in.next) += 1
    wordCounts
  }
}