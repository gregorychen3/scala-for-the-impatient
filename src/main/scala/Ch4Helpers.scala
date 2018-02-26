import scala.collection.JavaConverters._
import scala.collection.immutable.SortedMap

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

  def getWordsAndCountsImmutable(inStr: String) = {
    val in = new java.util.Scanner(inStr)
    var wordCounts = Map[String, Int]().withDefaultValue(0);
    while (in.hasNext) {
      val next = in.next
      wordCounts += (next -> (wordCounts(next) + 1))
    }
    wordCounts
  }

  def getWordsAndCountsImmutableSorted(inStr: String) = {
    val in = new java.util.Scanner(inStr)
    var wordCounts = collection.immutable.SortedMap[String, Int]().withDefaultValue(0);
    while (in.hasNext) {
      val next = in.next
      wordCounts += (next -> (wordCounts(next) + 1))
    }
    wordCounts
  }

  def getWordsAndCountsImmutableSortedWithJavaTreeMap(inStr: String) = {
    val in = new java.util.Scanner(inStr)
    var wordCounts = (SortedMap[String, Int]() ++ new java.util.TreeMap[String, Int].asScala.toMap).withDefaultValue(0)
    while (in.hasNext) {
      val next = in.next
      wordCounts += (next -> (wordCounts(next) + 1))
    }
    wordCounts
  }
}
