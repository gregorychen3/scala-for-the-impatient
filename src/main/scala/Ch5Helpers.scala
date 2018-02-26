object Ch5Helpers {
  class Counter {
    private var value = 0
    def increment(): Unit = {
      if (value < Int.MaxValue) value += 1
    }
    def current() = value
  }
}
