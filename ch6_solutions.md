# Ch6 Exercise Solutions
1. Refer to `src/main/scala/Ch6Helpers` for solutions and `src/test/scala/Ch6Tests` for tests.
2. Refer to `src/main/scala/Ch6Helpers` for solutions and `src/test/scala/Ch6Tests` for tests.
3. It is not a good idea to define an Origin object that extends java.awt.Point because the latter has methods that shouldn't be valid on an Origin, such as move(), setLocation(), and translate().
4. Refer to `src/main/scala/Ch6Helpers` for solutions and `src/test/scala/Ch6Tests` for tests.
5.
	```scala
	gchen213@C02VJ01NHTDD:scala-for-the-impatient$ cat ReverseHelloWorld.scala 
	object ReverseHelloWorld extends App {
	  println(args.foldRight("")((elem, accumulator) => s"$accumulator $elem"))
	}
	gchen213@C02VJ01NHTDD:scala-for-the-impatient$ scalac ReverseHelloWorld.scala && scala ReverseHelloWorld hello world
	 world hello
	```

