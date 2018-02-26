# Ch3 Exercise Solutions
1. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
2. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
3. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
4. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
5. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
6. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
7. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
8. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
9. Skipped due to dubious educational value.
10. Refer to `src/main/scala/Ch3Helpers` for solutions and `src/test/scala/Ch3Tests` for tests.
11.  
    ```scala
    scala> import java.awt.datatransfer._
    import java.awt.datatransfer._

    scala> val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
    flavors: java.awt.datatransfer.SystemFlavorMap = java.awt.datatransfer.SystemFlavorMap@58d6e55a

    scala> flavors.getNativesForFlavor(DataFlavor.imageFlavor)
        res0: java.util.List[String] = [PNG, JFIF, TIFF]

        scala> scala.collection.JavaConverters.asScalaBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
    res1: scala.collection.mutable.Buffer[String] = Buffer(PNG, JFIF, TIFF)
    ```

