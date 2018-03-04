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
10.
    ```scala
    scala> def getTimeZones() = java.util.TimeZone.getAvailableIDs.filter(_.contains("America/")).map(_.substring(8)).sorted
    getTimeZones: ()Array[String]

    scala> getTimeZones
    res0: Array[String] = Array(Adak, Anchorage, Anguilla, Antigua, Araguaina, Argentina/Buenos_Aires, Argentina/Catamarca, Argentina/ComodRivadavia, Argentina/Cordoba, Argentina/Jujuy, Argentina/La_Rioja, Argentina/Mendoza, Argentina/Rio_Gallegos, Argentina/Salta, Argentina/San_Juan, Argentina/San_Luis, Argentina/Tucuman, Argentina/Ushuaia, Aruba, Asuncion, Atikokan, Atka, Bahia, Bahia_Banderas, Barbados, Belem, Belize, Blanc-Sablon, Boa_Vista, Bogota, Boise, Buenos_Aires, Cambridge_Bay, Campo_Grande, Cancun, Caracas, Catamarca, Cayenne, Cayman, Chicago, Chihuahua, Coral_Harbour, Cordoba, Costa_Rica, Creston, Cuiaba, Curacao, Danmarkshavn, Dawson, Dawson_Creek, Denver, Detroit, Dominica, Edmonton, Eirunepe, El_Salvador, Ensenada, Fort_Nelson, Fort_Wayne, Fortaleza..
    ```
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

