import org.scalatest._

class Ch3Ex1Test extends FunSuite {
  test("getArrayOfRandomInt should get an array of 0 random ints in range [0, 1)") {
    val arrayLen = 0;
    val endExclusive = 1;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => { if (next >= 0 && next < endExclusive) res else false }
    ))
  }

  test("getArrayOfRandomInt should get an array of 1 random ints in range [0, 1)") {
    val arrayLen = 1;
    val endExclusive = 1;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => { if (next >= 0 && next < endExclusive) res else false }
    ))
  }

  test("getArrayOfRandomInt should get an array of 100 random ints in range [0, 4)") {
    val arrayLen = 100;
    val endExclusive = 4;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => { if (next >= 0 && next < endExclusive) res else false }
    ))
  }

  test("getArrayOfRandomInt should get an array of 100 random ints in range [0, 100)") {
    val arrayLen = 100;
    val endExclusive = 100;
    assert(Ch3Helpers.getArrayOfRandomInt(arrayLen, endExclusive).foldLeft(true)(
      (res, next) => { if (next >= 0 && next < endExclusive) res else false }
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