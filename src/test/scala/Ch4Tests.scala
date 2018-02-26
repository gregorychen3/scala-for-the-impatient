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

class Ch4Ex3Test extends FunSuite {
  test("Empty string should have no word counts") {
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutable("")
    assert(wordCounts.size == 0)
  }

  test("The String [Hello] should have correct word counts") {
    val testStr = "Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutable(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 1)
  }

  test("The String [Hello Hello] should have correct word counts") {
    val testStr = "Hello Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutable(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 2)
  }

  test("The String [Hello World] should have correct word counts") {
    val testStr = "Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutable(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 1)
    assert(wordCounts("World") == 1)
  }

  test("The String [Hello Hello World] should have correct word counts") {
    val testStr = "Hello Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutable(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
  }


  test("The String [Hello World Hello] should have correct word counts") {
    val testStr = "Hello World Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutable(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
  }
}

class Ch4Ex4Test extends FunSuite {
  test("Empty string should have no word counts") {
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted("")
    assert(wordCounts.size == 0)
  }

  test("The String [Hello] should have correct word counts") {
    val testStr = "Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 1)
    assert(wordCounts.keys.toSeq == List("Hello"))
  }

  test("The String [Hello Hello] should have correct word counts") {
    val testStr = "Hello Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts.keys.toSeq == List("Hello"))
  }

  test("The String [Hello World] should have correct word counts") {
    val testStr = "Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 1)
    assert(wordCounts("World") == 1)
    assert(wordCounts.keys.toSeq == List("Hello", "World"))
  }

  test("The String [Hello Hello World] should have correct word counts") {
    val testStr = "Hello Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
    assert(wordCounts.keys.toSeq == List("Hello", "World"))
  }
  
  test("The String [Hello World Hello] should have correct word counts") {
    val testStr = "Hello World Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
    assert(wordCounts.keys.toSeq == List("Hello", "World"))
  }

  test("The String [d b c a] should have correct iteration order") {
    val testStr = "d b c a"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSorted(testStr)
    assert(wordCounts.keys.toSeq == List("a", "b", "c", "d"))
  }
}

class Ch4Ex5Test extends FunSuite {
  test("Empty string should have no word counts") {
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap("")
    assert(wordCounts.size == 0)
  }

  test("The String [Hello] should have correct word counts") {
    val testStr = "Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 1)
    assert(wordCounts.keys.toSeq == List("Hello"))
  }

  test("The String [Hello Hello] should have correct word counts") {
    val testStr = "Hello Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap(testStr)
    assert(wordCounts.size == 1)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts.keys.toSeq == List("Hello"))
  }

  test("The String [Hello World] should have correct word counts") {
    val testStr = "Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 1)
    assert(wordCounts("World") == 1)
    assert(wordCounts.keys.toSeq == List("Hello", "World"))
  }

  test("The String [Hello Hello World] should have correct word counts") {
    val testStr = "Hello Hello World"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
    assert(wordCounts.keys.toSeq == List("Hello", "World"))
  }

  test("The String [Hello World Hello] should have correct word counts") {
    val testStr = "Hello World Hello"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap(testStr)
    assert(wordCounts.size == 2)
    assert(wordCounts("Hello") == 2)
    assert(wordCounts("World") == 1)
    assert(wordCounts.keys.toSeq == List("Hello", "World"))
  }

  test("The String [d b c a] should have correct iteration order") {
    val testStr = "d b c a"
    val wordCounts = Ch4Helpers.getWordsAndCountsImmutableSortedWithJavaTreeMap(testStr)
    assert(wordCounts.keys.toSeq == List("a", "b", "c", "d"))
  }
}

class Ch4Ex6Test extends FunSuite {
  test("LinkedHashMap's iteration order should be the same as insertion order") {
    assert(Ch4Helpers.getDaysOfWeek().keys.toSeq == Array("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
      "Saturday", "Sunday").toSeq)
  }
}

class Ch4Ex8Test extends FunSuite {
  test("Min and max in the Array [0] should be 0 and 0, respectively") {
    assert(Ch4Helpers.getMinMaxPair(Array(0)) == (0 -> 0))
  }

  test("Min and max in the Array [0, 0] should be 0 and 0, respectively") {
    assert(Ch4Helpers.getMinMaxPair(Array(0, 0)) == (0 -> 0))
  }

  test("Min and max in the Array [0, 1] should be 0 and 1, respectively") {
    assert(Ch4Helpers.getMinMaxPair(Array(0, 1)) == (0 -> 1))
  }

  test("Min and max in the Array [1, 0] should be 0 and 1, respectively") {
    assert(Ch4Helpers.getMinMaxPair(Array(1, 0)) == (0 -> 1))
  }
}