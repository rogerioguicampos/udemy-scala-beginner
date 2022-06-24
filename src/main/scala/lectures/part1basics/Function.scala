package lectures.part1basics

object Function  extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Ana", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  println(aBigFunction(5))

  /*
  1. A greeting function (name, age) => "Hi, my name is $name and I'm $age years old"
  2. Factorial function 1 * 2 * 3 * 4 * ... * n
  3. A Fibonacci function
    f(1) = 1
    f(2) = 1
    f(3) = f(n - 1) + f(n - 2)
  4. Tests if a number is prime
  */

  def aGreetingForKids(name: String, age: Int): Unit = {
    println(f"Hi, my name is $name and I'm $age years old")
  }

  def aFactoria(n: Int): Int = {
    if (n == 1) n
    else n * aFactoria(n-1)
  }

  def aFibonacci(n: Int): Int = {
    if (n <= 2) 1
    else aFibonacci(n-1) + aFibonacci(n-2)
    //
    // (1)1 (2)1 (3)2 (4)3 (5)5 (6)8 (7)13 (8)21 (9)34
  }

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  aGreetingForKids("Rogerio Guimaraes de Campos", 32)
  println(aFactoria(5))
  println(aFibonacci(8))
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))


  def twofer(name: String = "you"): String = f"One for $name, one for me."

  println(twofer())
  println(twofer("Alice"))
  println(twofer("Bob"))
  println(twofer())
}
