import java.util.{HashMap => JavaHashMap}
import collection.mutable.{HashMap => ScalaHashMap}

object Ch7Helpers {
  def copyJava2Scala(from: JavaHashMap[String, Int], to: ScalaHashMap[String, Int]): Unit = {
    import collection.JavaConverters._
    for ((k, v) <- from.asScala) { to(k) = v }
  }
}
