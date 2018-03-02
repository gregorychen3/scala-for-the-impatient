import org.scalatest._
import collection.mutable.ArrayBuffer

class Ch3Ex1Test extends FunSuite {
  test("getArrayOfRandomInt should get an array of 0 random ints in range [0, 1)") {
    val arrayLen = 0;
    val endExclusive = 1;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => {
        if (next >= 0 && next < endExclusive) res else false
      }
    ))
  }

  test("getArrayOfRandomInt should get an array of 1 random ints in range [0, 1)") {
    val arrayLen = 1;
    val endExclusive = 1;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => {
        if (next >= 0 && next < endExclusive) res else false
      }
    ))
  }

  test("getArrayOfRandomInt should get an array of 100 random ints in range [0, 4)") {
    val arrayLen = 100;
    val endExclusive = 4;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => {
        if (next >= 0 && next < endExclusive) res else false
      }
    ))
  }

  test("getArrayOfRandomInt should get an array of 100 random ints in range [0, 100)") {
    val arrayLen = 100;
    val endExclusive = 100;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => {
        if (next >= 0 && next < endExclusive) res else false
      }
    ))
  }
}

class Ch3Ex2Test extends FunSuite {
  test("Swapping adjacent elements of [1, 2, 3, 4, 5] in place should be [2, 1, 4, 3, 5]") {
    val a = Array(1, 2, 3, 4, 5)
    assert(Ch3Helpers.swapInPlace(a).toSeq == Array(2, 1, 4, 3, 5).toSeq)
  }

  test("Swapping adjacent elements of [1, 2, 3, 4] in place should be [2, 1, 4, 3]") {
    val a = Array(1, 2, 3, 4)
    assert(Ch3Helpers.swapInPlace(a).toSeq == Array(2, 1, 4, 3).toSeq)
  }

  test("Swapping adjacent elements of [] in place should be []") {
    val a = Array[Int](0)
    assert(Ch3Helpers.swapInPlace(a).toSeq == Array(0).toSeq)
  }

  test("Swapping adjacent elements of [2] in place should be [2]") {
    val a = Array(2)
    assert(Ch3Helpers.swapInPlace(a).toSeq == Array(2).toSeq)
  }
}

class Ch3Ex3Test extends FunSuite {
  test("Swapping adjacent elements of [1, 2, 3, 4, 5] should yield [2, 1, 4, 3, 5]") {
    val a = Array(1, 2, 3, 4, 5)
    assert(Ch3Helpers.swap(a).toSeq == Array(2, 1, 4, 3, 5).toSeq)
  }

  test("Swapping adjacent elements of [1, 2, 3, 4] should yield [2, 1, 4, 3]") {
    val a = Array(1, 2, 3, 4)
    assert(Ch3Helpers.swap(a).toSeq == Array(2, 1, 4, 3).toSeq)
  }

  test("Swapping adjacent elements of [] should yield []") {
    val a = Array[Int](0)
    assert(Ch3Helpers.swap(a).toSeq == Array(0).toSeq)
  }

  test("Swapping adjacent elements of [2] should yield [2]") {
    val a = Array(2)
    assert(Ch3Helpers.swap(a).toSeq == Array(2).toSeq)
  }
}

class Ch3Ex4Test extends FunSuite {

  test("Partitioning [1] should yield [1]") {
    assert(Ch3Helpers.getPartitionedArray(Array(1)).toSeq == Array(1).toSeq)
  }

  test("Partitioning [1, 2] should yield [1, 2]") {
    assert(Ch3Helpers.getPartitionedArray(Array(1, 2)).toSeq == Array(1, 2).toSeq)
  }

  test("Partitioning [0] should yield [0]") {
    assert(Ch3Helpers.getPartitionedArray(Array(0)).toSeq == Array(0).toSeq)
  }

  test("Partitioning [0, 1] should yield [1, 0]") {
    assert(Ch3Helpers.getPartitionedArray(Array(0, 1)).toSeq == Array(1, 0).toSeq)
  }

  test("Partitioning [0, 1, 2] should yield [1, 2, 0]") {
    assert(Ch3Helpers.getPartitionedArray(Array(0, 1, 2)).toSeq == Array(1, 2, 0).toSeq)
  }

  test("Partitioning [-1, 0] should yield [-1, 0]") {
    assert(Ch3Helpers.getPartitionedArray(Array(-1, 0)).toSeq == Array(-1, 0).toSeq)
  }

  test("Partitioning [-1, 0, 1] should yield [1, -1, 0]") {
    assert(Ch3Helpers.getPartitionedArray(Array(-1, 0, 1)).toSeq == Array(1, -1, 0).toSeq)
  }

  test("Partitioning [-1, 0, 1, 2] should yield [1, 2, -1, 0]") {
    assert(Ch3Helpers.getPartitionedArray(Array(-1, 0, 1, 2)).toSeq == Array(1, 2, -1, 0).toSeq)
  }
}

class Ch3Ex5Test extends FunSuite {
  test("Average of [0.0] should be 0.0") {
    assert(Ch3Helpers.average(Array(0.0)) == 0.0)
  }

  test("Average of [1.1] should be 1.1") {
    assert(Ch3Helpers.average(Array(1.1)) == 1.1)
  }

  test("Average of [0.0, 1.1] should be 0.55") {
    assert(Ch3Helpers.average(Array(0.0, 1.1)) == 0.55)
  }
}

class Ch3Ex6Test extends FunSuite {
  test("Sorting the Array [] should yield []") {
    assert(Ch3Helpers.reverseSort(Array[Int]()).toSeq == Array[Int]().toSeq)
  }

  test("Sorting the Array [1] should yield [1]") {
    assert(Ch3Helpers.reverseSort(Array(1)).toSeq == Array(1).toSeq)
  }

  test("Sorting the Array [1, 2] should yield [2, 1]") {
    assert(Ch3Helpers.reverseSort(Array(1, 2)).toSeq == Array(2, 1).toSeq)
  }

  test("Sorting the Array [2, 1] should yield [2, 1]") {
    assert(Ch3Helpers.reverseSort(Array(2, 1)).toSeq == Array(2, 1).toSeq)
  }

  test("Sorting the Array [5, 3, 7, 5, 1, 2, 1] should yield [2, 1]") {
    assert(Ch3Helpers.reverseSort(Array(5, 3, 7, 5, 1, 2, 1)).toSeq == Array(7, 5, 5, 3, 2, 1, 1).toSeq)
  }

  test("Sorting the ArrayBuffer [] should yield []") {
    assert(Ch3Helpers.reverseSort(ArrayBuffer[Int]()).toSeq == ArrayBuffer[Int]().toSeq)
  }

  test("Sorting the ArrayBuffer [1] should yield [1]") {
    assert(Ch3Helpers.reverseSort(ArrayBuffer(1)).toSeq == ArrayBuffer(1).toSeq)
  }

  test("Sorting the ArrayBuffer [1, 2] should yield [2, 1]") {
    assert(Ch3Helpers.reverseSort(ArrayBuffer(1, 2)).toSeq == ArrayBuffer(2, 1).toSeq)
  }

  test("Sorting the ArrayBuffer [2, 1] should yield [2, 1]") {
    assert(Ch3Helpers.reverseSort(ArrayBuffer(2, 1)).toSeq == ArrayBuffer(2, 1).toSeq)
  }

  test("Sorting the ArrayBuffer [5, 3, 7, 5, 1, 2, 1] should yield [2, 1]") {
    assert(Ch3Helpers.reverseSort(ArrayBuffer(5, 3, 7, 5, 1, 2, 1)).toSeq == ArrayBuffer(7, 5, 5, 3, 2, 1, 1).toSeq)
  }
}

class Ch3Ex7Test extends FunSuite {
  test("The Array [0] without dups should be [0]") {
    assert(Ch3Helpers.getArrayWithoutDups(Array(0)).toSeq == Array(0).toSeq)
  }

  test("The Array [0, 0] without dups should be [0]") {
    assert(Ch3Helpers.getArrayWithoutDups(Array(0, 0)).toSeq == Array(0).toSeq)
  }

  test("The Array [0, 0, 0] without dups should be [0]") {
    assert(Ch3Helpers.getArrayWithoutDups(Array(0, 0, 0)).toSeq == Array(0).toSeq)
  }

  test("The Array [0, 1] without dups should be [0, 1]") {
    assert(Ch3Helpers.getArrayWithoutDups(Array(0, 1)).toSeq == Array(0, 1).toSeq)
  }

  test("The Array [0, 1, 0] without dups should be [0, 1]") {
    assert(Ch3Helpers.getArrayWithoutDups(Array(0, 1, 0)).toSeq == Array(0, 1).toSeq)
  }

  test("The Array [0, 1, 1] without dups should be [0, 1]") {
    assert(Ch3Helpers.getArrayWithoutDups(Array(0, 1, 1)).toSeq == Array(0, 1).toSeq)
  }
}

class Ch3Ex8Test extends FunSuite {
  test("Removing all but the first negative num in [] should give []") {
    var a = ArrayBuffer[Int]()
    Ch3Helpers.removeAllButFirstNegativeNum(a)
    assert(a == ArrayBuffer[Int]())
  }

  test("Removing all but the first negative num in [-1] should give [-1]") {
    var a = ArrayBuffer(-1)
    Ch3Helpers.removeAllButFirstNegativeNum(a)
    assert(a == ArrayBuffer(-1))
  }

  test("Removing all but the first negative num in [-1, 0] should give [-1, 0]") {
    var a = ArrayBuffer(-1, 0)
    Ch3Helpers.removeAllButFirstNegativeNum(a)
    assert(a == ArrayBuffer(-1, 0))
  }

  test("Removing all but the first negative num in [0, -1] should give [0, -1]") {
    var a = ArrayBuffer(0, -1)
    Ch3Helpers.removeAllButFirstNegativeNum(a)
    assert(a == ArrayBuffer(0, -1))
  }

  test("Removing all but the first negative num in [-2, -1, 0] should give [-2, 0]") {
    var a = ArrayBuffer(-2, -1, 0)
    Ch3Helpers.removeAllButFirstNegativeNum(a)
    assert(a == ArrayBuffer(-2, 0))
  }

  test("Removing all but the first negative num in [-2, 0, -1] should give [-2, 0]") {
    var a = ArrayBuffer(-2, 0, -1)
    Ch3Helpers.removeAllButFirstNegativeNum(a)
    assert(a == ArrayBuffer(-2, 0))
  }
}
