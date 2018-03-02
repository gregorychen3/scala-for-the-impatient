package object Ch2Helpers {

  import java.time.LocalDate

  def getSignum(i: Double) =
    if (i < 0) -1
    else if (i == 0) 0
    else 1

  def countdown(n: Int) = {
    var ret: String = ""
    for (i <- n to 0 by -1) ret += i
    ret
  }

  def getProductOfUnicodes(str: String) = {
    var ret: Long = 1
    for (c <- str) ret *= c.toInt
    ret
  }

  def getProductOfUnicodesNoLoop(str: String) = str.foldLeft(1L)(_ * _.toLong)

  def product(s: String) = getProductOfUnicodesNoLoop(s)

  def productRecursive(s: String) = productRecursiveHelper(s, 1L)

  def productRecursiveHelper(s: String, i: Long): Long = {
    if (s.isEmpty) i
    else productRecursiveHelper(s.drop(1), i * s(0).toLong)
  }

  def myPow(x: Int, n: Int): Double =
    if (n % 2 == 0 && n > 0) myPow(x, n / 2) * myPow(x, n / 2)
    else if (n % 2 != 0 && n > 0) x * myPow(x, n - 1)
    else if (n == 0) 1
    else 1 / myPow(x, -n)

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = LocalDate.of(args(0).toString.toInt,
      args(1).toString.toInt,
      args(2).toString.toInt)
  }

}
