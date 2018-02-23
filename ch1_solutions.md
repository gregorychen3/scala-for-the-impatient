# Ch1 Exercise Solutions
1. The below methods can be applied:  
    ```scala
    scala> 3                 
    !=   /    >>>            doubleValue   hashCode        isValidByte    min          synchronized     toHexString     unary_-      
    ##   <    ^              ensuring      intValue        isValidChar    ne           to               toInt           unary_~      
    %    <<   abs            eq            isInfinite      isValidInt     notify       toBinaryString   toLong          underlying   
    &    <=   asInstanceOf   equals        isInfinity      isValidLong    notifyAll    toByte           toOctalString   until        
    *    ==   byteValue      floatValue    isInstanceOf    isValidShort   round        toChar           toRadians       wait         
    +    >    ceil           floor         isNaN           isWhole        self         toDegrees        toShort         |            
    -    >=   compare        formatted     isNegInfinity   longValue      shortValue   toDouble         toString        →            
    ->   >>   compareTo      getClass      isPosInfinity   max            signum       toFloat          unary_+                      
    ```
2. Result differs from 3 by 4.440892098500626E-16.
    ```scala
    scala> import scala.math._
    import scala.math._

    scala> sqrt(3)
    res0: Double = 1.7320508075688772

    scala> pow(res0, 2)
    res1: Double = 2.9999999999999996

    scala> 3 - res1
    res2: Double = 4.440892098500626E-16
    ```
3. res variables are val.
    ```scala
    scala> var myVar = 2
    myVar: Int = 2

    scala> val myVal = 2
    myVal: Int = 2

    scala> 2
    res0: Int = 2

    scala> myVar += 1

    scala> myVar
    res2: Int = 3

    scala> myVal += 1
    <console>:13: error: value += is not a member of Int
      Expression does not convert to assignment because receiver is not assignable.
           myVal += 1
                 ^

    scala> res0 += 1
    <console>:13: error: value += is not a member of Int
      Expression does not convert to assignment because receiver is not assignable.
           res0 += 1
                ^
    ```
4. Per http://scala-lang.org/api/current/scala/collection/immutable/StringOps.html#*(n:Int):String, this operation returns the current string concatenated n times.
	```scala
	scala> "crazy" * 3
	res0: String = crazycrazycrazy
	```
5. Per http://scala-lang.org/api/current/scala/Int.html#max(that:Int):Int, the max method returns the larger of this and that.
	```scala
	scala> 10 max 2
	res0: Int = 10
	```
6. 
	```scala
	scala> val x: BigInt = 2
	x: BigInt = 2

	scala> x.pow(1024)
	res0: scala.math.BigInt = 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
	```
7.  
	```scala
	scala> import math.BigInt
	import math.BigInt

	scala> import BigInt.probablePrime
	import BigInt.probablePrime

	scala> import util.Random
	import util.Random

	scala> probablePrime(100, Random)
	res0: scala.math.BigInt = 1153228787909717743149305360789
	```
8. 
	```scala
	scala> math.BigInt.probablePrime(100, util.Random).toString(36)
	res0: String = 2naon5my2lpsnqrc11xj
	```
9. 
	```scala
	scala> val myStr = "abcd"
	myStr: String = abcd

	scala> myStr(0)
	res0: Char = a

	scala> myStr.last
	res1: Char = d

	scala> 
	```
10. See http://scala-lang.org/api/current/scala/collection/immutable/StringOps.html for descriptions of take, drop, takeRight, and dropRight. The advantage over substring is that they take a single index argument instead of two. Also, they are arguably more intuitive to use.

