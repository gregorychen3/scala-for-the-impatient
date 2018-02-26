# Ch4 Exercise Solutions
1. Refer to `src/main/scala/Ch4Helpers` for solutions and `src/test/scala/Ch4Tests` for tests.
2. Refer to `src/main/scala/Ch4Helpers` for solutions and `src/test/scala/Ch4Tests` for tests.
3. Refer to `src/main/scala/Ch4Helpers` for solutions and `src/test/scala/Ch4Tests` for tests.
4. Refer to `src/main/scala/Ch4Helpers` for solutions and `src/test/scala/Ch4Tests` for tests.
5. Refer to `src/main/scala/Ch4Helpers` for solutions and `src/test/scala/Ch4Tests` for tests.
6. Refer to `src/main/scala/Ch4Helpers` for solutions and `src/test/scala/Ch4Tests` for tests.
7.
	```scala
	scala> import scala.collection.JavaConverters._
	import scala.collection.JavaConverters._

	scala> val props = java.lang.System.getProperties.asScala
	props: scala.collection.mutable.Map[String,String] =
	Map(env.emacs -> "", java.runtime.name -> Java(TM) SE Runtime Environment, sun.boot.library.path -> /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib, java.vm.version -> 25.162-b12, gopherProxySet -> false, java.vm.vendor -> Oracle Corporation, java.vendor.url -> http://java.oracle.com/, path.separator -> :, java.vm.name -> Java HotSpot(TM) 64-Bit Server VM, file.encoding.pkg -> sun.io, user.country -> US, sun.java.launcher -> SUN_STANDARD, sun.os.patch.level -> unknown, java.vm.specification.name -> Java Virtual Machine Specification, user.dir -> /Users/gchen213/scala-for-the-impatient, java.runtime.version -> 1.8.0_162-b12, java.awt.graphicsenv -> sun.awt.CGraphicsEnvironment, java.en...

	scala> for((k,v) <- props) println(s"$k | $v")
	env.emacs | 
	java.runtime.name | Java(TM) SE Runtime Environment
	sun.boot.library.path | /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib
	java.vm.version | 25.162-b12
	gopherProxySet | false
	java.vm.vendor | Oracle Corporation
	java.vendor.url | http://java.oracle.com/
	path.separator | :
	java.vm.name | Java HotSpot(TM) 64-Bit Server VM
	file.encoding.pkg | sun.io
	user.country | US
	sun.java.launcher | SUN_STANDARD
	sun.os.patch.level | unknown
	java.vm.specification.name | Java Virtual Machine Specification
	user.dir | /Users/gchen213/scala-for-the-impatient
	java.runtime.version | 1.8.0_162-b12
	java.awt.graphicsenv | sun.awt.CGraphicsEnvironment
	java.endorsed.dirs | /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/endorsed
	os.arch | x86_64
	java.io.tmpdir | /var/folders/3g/4g6_fhpd6yb14l6m8vrk0p1w0000gq/T/
	line.separator | 

	java.vm.specification.vendor | Oracle Corporation
	os.name | Mac OS X
	sun.jnu.encoding | UTF-8
	java.library.path | /Users/gchen213/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
	java.specification.name | Java Platform API Specification
	java.class.version | 52.0
	sun.management.compiler | HotSpot 64-Bit Tiered Compilers
	os.version | 10.12.6
	scala.boot.class.path | /usr/local/Cellar/scala/2.12.4/libexec/lib/jline-2.14.5.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-compiler.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-library.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-parser-combinators_2.12-1.0.6.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-reflect.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-swing_2.12-2.0.0.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-xml_2.12-1.0.6.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scalap-2.12.4.jar
	user.home | /Users/gchen213
	user.timezone | 
	scala.home | /usr/local/Cellar/scala/2.12.4/libexec
	java.awt.printerjob | sun.lwawt.macosx.CPrinterJob
	file.encoding | UTF-8
	java.specification.version | 1.8
	scala.usejavacp | true
	java.class.path | ""
	user.name | gchen213
	java.vm.specification.version | 1.8
	sun.java.command | scala.tools.nsc.MainGenericRunner
	java.home | /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre
	sun.arch.data.model | 64
	user.language | en
	java.specification.vendor | Oracle Corporation
	awt.toolkit | sun.lwawt.macosx.LWCToolkit
	java.vm.info | mixed mode
	java.version | 1.8.0_162
	java.ext.dirs | /Users/gchen213/Library/Java/Extensions:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/ext:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java
	sun.boot.class.path | /Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_162.jdk/Contents/Home/jre/classes:/usr/local/Cellar/scala/2.12.4/libexec/lib/jline-2.14.5.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-compiler.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-library.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-parser-combinators_2.12-1.0.6.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-reflect.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-swing_2.12-2.0.0.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scala-xml_2.12-1.0.6.jar:/usr/local/Cellar/scala/2.12.4/libexec/lib/scalap-2.12.4.jar
	java.vendor | Oracle Corporation
	file.separator | /
	java.vendor.url.bug | http://bugreport.sun.com/bugreport/
	sun.io.unicode.encoding | UnicodeBig
	sun.cpu.endian | little
	sun.cpu.isalist | 
	```

