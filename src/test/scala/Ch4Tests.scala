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

class Ch4Ex2Test extends FunSuite {
  test("Empty string should have no word counts") {
    val wordCounts = Ch4Helpers.getWordsAndCounts("")
    assert(wordCounts.size == 0)
  }

  test("The String [Hello] should have correct word counts") {
    val testStr = "Hello"
    val wordCounts = Ch4Helpers.getWordsAndCounts(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 1)
  }

  test("The String [Hello Hello] should have correct word counts") {
    val testStr = "Hello Hello"
    val wordCounts = Ch4Helpers.getWordsAndCounts(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 2)
  }

  test("The String [Hello World] should have correct word counts") {
    val testStr = "Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCounts(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 1)
    assert(wordCounts("World") == 1)
  }

  test("The String [Hello Hello World] should have correct word counts") {
    val testStr = "Hello Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCounts(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
  }


  test("The String [Hello World Hello] should have correct word counts") {
    val testStr = "Hello World Hello"
    val wordCounts = Ch4Helpers.getWordsAndCounts(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
  }
}