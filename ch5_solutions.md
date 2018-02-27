# Ch5 Exercise Solutions
1. Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
2. Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
3. Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
4. Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
5. Scala class:
	```scala
	gchen213@C02VJ01NHTDD:scala-for-the-impatient$ cat Student.scala 
	import scala.beans.BeanProperty
	class Student(@BeanProperty var name: String) {}
	```
	Java methods generated:
	```java
	gchen213@C02VJ01NHTDD:scala-for-the-impatient$ scalac Student.scala 
	gchen213@C02VJ01NHTDD:scala-for-the-impatient$ javap Student.class 
	Compiled from "Student.scala"
	public class Student {
	  public java.lang.String name();
	  public void name_$eq(java.lang.String);
	  public java.lang.String getName();
	  public void setName(java.lang.String);
	  public Student(java.lang.String);
	}
	```
	While JavaBeans getters and setters can indeed be called from Scala, Scala's getters and setters should be preferred over them.
6. Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
7. Primary constructor parameter should be a plain parameter since it is only used for construction and should not be available anywhere else.
   Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
8. The primary constructor should take all four args so that the auxiliary constructors need only call the primary constructor with default values for missing optional args.
   Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.
9. Point taken that the Java or C++ impl of the previous exercise's Car class would be much longer than the Scala impl. Exercise skipped.
10. Not sure which form I prefer; open to opinions.
   Refer to `src/main/scala/Ch5Helpers` for solutions and `src/test/scala/Ch5Tests` for tests.

