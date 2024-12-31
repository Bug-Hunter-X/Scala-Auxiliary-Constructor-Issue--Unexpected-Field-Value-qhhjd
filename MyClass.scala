```scala
class MyClass(val x: Int) {
  def this() { this(0) }
}

val myInstance = new MyClass
println(myInstance.x) // This prints 0

val anotherInstance = new MyClass(5)
println(anotherInstance.x) // This prints 5

//Problem:
//The issue occurs when you try to access x in different ways. Because of this the value of x can vary in unexpected ways leading to difficult-to-debug errors.

//Why this is a problem:
//The problem lies in how the auxiliary constructor calls the primary constructor. When this() is called, it initializes x to 0, which might be unexpected if you're only looking at the code of the primary constructor.
```