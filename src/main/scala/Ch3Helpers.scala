import util.Random

object Ch3Helpers {

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
    for(i <- a.indices) yield
      if (i % 2 == 0 && i + 1 < a.length) a(i + 1)
      else if (i % 2 != 0) a(i - 1)
      else a(i)
  }

  // Returns a new array that contains all positive values of a in their original order, followed by all values that are
  // zero or negative, in their original order.
  def getPartitionedArray(a: Array[Int]) = a.filter(_ > 0) ++ a.filter(_ <= 0)

  def average(a: Array[Double]) = a.sum / a.length
}
