# Ch4 Exercise Solutions
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

