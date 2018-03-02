import org.scalatest.FunSuite

class Ch7Ex3Test extends FunSuite {
  test("Ch7Ex3Random.nextInt should return an Int") {
    assert(Ch7Ex3Random.nextInt().isInstanceOf[Int])
  }
  test("Ch7Ex3Random.nextDouble() should return a Double") {
    assert(Ch7Ex3Random.nextDouble().isInstanceOf[Double])
  }
}

class Ch7Ex6Test extends FunSuite {
  test("Copy an empty Java HashMap to a Scala HashMap") {
    val jMap = new java.util.HashMap[String, Int]()
    val sMap = collection.mutable.HashMap[String, Int]()
    Ch7Helpers.copyJava2Scala(jMap, sMap)
    assert(sMap.size == 0)
  }

  test("Copy a non-empty Java HashMap to a Scala HashMap") {
    val jMap = new java.util.HashMap[String, Int]()
    val sMap = collection.mutable.HashMap[String, Int]()
    jMap.put("ONE", 1)
    Ch7Helpers.copyJava2Scala(jMap, sMap)
    assert(sMap("ONE") == 1)
  }
}
