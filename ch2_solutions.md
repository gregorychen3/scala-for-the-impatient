# Ch2 Exercise Solutions
2. The value of an empty block statement is (), and its type is Unit. Unit has a single value written as ().
    ```scala
    scala> val x = {}
    x: Unit = ()
    ```
3. See the below situation. X must be of type Unit.
    ```scala
    scala> var x = ()
    x: Unit = ()

    scala> var y = 0
    y: Int = 0

    scala> x = y = 1
    x: Unit = ()
    ```
4. 
    ```scala
    scala> for (i <- 10 to 0 by -1) println(i)
    10
    9
    8
    7
    6
    5
    4
    3
    2
    1
    0
    ```

