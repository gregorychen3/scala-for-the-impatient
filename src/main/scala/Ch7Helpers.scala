object Ch7Helpers {
  import java.util.{HashMap => JavaHashMap}
  import collection.mutable.{HashMap => ScalaHashMap}

  def copyJava2Scala(from: JavaHashMap[String, Int], to: ScalaHashMap[String, Int]): Unit = {
    import collection.JavaConverters._

    for ((k, v) <- from.asScala) { to(k) = v }
  }
}
