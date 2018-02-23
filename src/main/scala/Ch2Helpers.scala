object Ch2Helpers {
  def getSignum(i: Double) =
    if (i < 0) -1
    else if (i == 0) 0
    else 1

  def countdown(n: Int) = {
    var ret: String = ""
    for (i <- n to 0 by -1) ret += i
    ret
  }
}
