package object Ch7Ex3Random {

  private val a = 1664525

  private val b = 1013904223

  private val  n = 32

  private var previous: Double = 2.0

  def nextInt(): Int = {
    previous = nextDouble()
    previous.toInt
  }

  def nextDouble(): Double = {
    previous = (previous * a + b) % math.pow(2, n)
    previous
  }

  def setSeed(seed: Int): Unit = { previous = seed }
}
