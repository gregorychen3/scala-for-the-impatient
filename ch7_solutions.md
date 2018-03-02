# Ch7 Exercise Solutions
1.
```scala
gchen213@C02VJ01NHTDD:temp$ ls
MyPackage.scala Tester1.scala   Tester2.scala
gchen213@C02VJ01NHTDD:temp$ cat MyPackage.scala 
package com {
  package horstmann {
    object Horstmann {
      val author = "Horstmann"
    }
    package impatient {
      object Impatient {
        val patienceLevel = 0
      }
    }
  }
}

gchen213@C02VJ01NHTDD:temp$ cat Tester1.scala 
package com.horstmann.impatient
class Tester1 {
  val horstmann = Horstmann.author
  val impatient = Impatient.patienceLevel
}

gchen213@C02VJ01NHTDD:temp$ cat Tester2.scala 
package com
package horstmann
package impatient

class Tester1 {
  val horstmann = Horstmann.author
  val impatient = Impatient.patienceLevel
}

gchen213@C02VJ01NHTDD:temp$ scalac MyPackage.scala && ls
MyPackage.scala Tester1.scala   Tester2.scala   com
gchen213@C02VJ01NHTDD:temp$ scalac Tester1.scala 
Tester1.scala:3: error: not found: value Horstmann
  val horstmann = Horstmann.author
                  ^
one error found
gchen213@C02VJ01NHTDD:temp$ scalac Tester2.scala 
gchen213@C02VJ01NHTDD:temp$ 
```
2. Skipped. Exercise instructions unclear.


