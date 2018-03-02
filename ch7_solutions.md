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
3. Refer to `src/main/scala/Ch7Ex1Random.scala` for solution and `src/test/scala/Ch7Tests` for tests.
4. Section 7.5 states,
> A package can contain classes, objects, and traits, but not the definitions of functions or variables. That's an unfortunate limitation of the Java virtual machine. It would make more sense to add utility functions or constants to a package than to some Utils object. Package objects address this limitation.
5. The method is package private to the package `com`. In general this a useful language feature which achieves the same effect as Java's package private class members. However, in this particular cse it is not very useful, since the package `com` is a top level package.
6. Refer to `src/main/scala/Ch7Helpers.scala` for solution and `src/test/scala/Ch7Tests` for tests.
7. Refer to `src/main/scala/Ch7Helpers.scala` for solution and `src/test/scala/Ch7Tests` for tests.
8. Bad idea as you will be importing the entire Java universe into your namespace. This would be a terrible idea even if it were a Java program, not to mention a Scala one. Besides being unnecessary, you could end up "overriding" useful Scala classes that have similar or identical names.


