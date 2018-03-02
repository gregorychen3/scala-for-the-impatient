
package object Ch3Helpers {

  import scala.collection.mutable.ArrayBuffer
  import util.Random

  // Returns an array of n random integers between 0 (inclusive) and endExclusive
  def getArrayOfRandomInt(n: Int, endExclusive: Int) = {
    val ret = new Array[Int](n)
    for (i <- ret.indices) ret(i) = Random.nextInt(endExclusive)
    ret
  }

  def swapInPlace(a: Array[Int]): Array[Int] = {
    for (i <- a.indices by 2) if (i + 1 < a.length) swapHelper(a, i, i + 1)
    a
  }

  private def swapHelper(a: Array[Int], i: Int, j: Int): Unit = {
    val temp = a(i)
    a(i) = a(j)
    a(j) = temp
  }

  def swap(a: Array[Int]) = {
    for (i <- a.indices) yield
      if (i % 2 == 0 && i + 1 < a.length) a(i + 1)
      else if (i % 2 != 0) a(i - 1)
      else a(i)
  }

  // Returns a new array that contains all positive values of a in their original order, followed by all values that are
  // zero or negative, in their original order.
  def getPartitionedArray(a: Array[Int]) = a.filter(_ > 0) ++ a.filter(_ <= 0)

  def average(a: Array[Double]) = a.sum / a.length

  def reverseSort(a: Seq[Int]) = a.sortWith(_ > _)

  def getArrayWithoutDups(a: Array[Any]) = a.distinct

  def removeAllButFirstNegativeNum(a: ArrayBuffer[Int]) = {
    // Collect positions of negative elements
    val negativePositions = for (i <- a.indices if a(i) < 0) yield i
    // Drop the first negative element
    val positionsToRemove = negativePositions.slice(1, negativePositions.length)
    // Remove starting from the back
    for (i <- positionsToRemove.reverse) a.remove(i)
  }
}
