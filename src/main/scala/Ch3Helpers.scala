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
}
