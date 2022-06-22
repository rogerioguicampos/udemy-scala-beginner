package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  val y = "Type string"
  println(y)

  // VALS ARE IMMUTABLE

  // COMPILER can infer types

  val aString: String = "Hello, Scala"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShor: Short = 4613
  val aLong: Long = 9999999999999999
  val aFloat: Float = 2.0
  val aDouble: Double = 3.14

  // variables
  var aVariable: Int = 4

  println(aVariable)
  aVariable = 5 // side effects
  println(aVariable)
  // VAR ARE MUTABLE
}

/*
  Lessons
  - prefer vals over vars
  - all vals and vars have types
  - compiler automatically infers types when omitted
  - learned how to use basic types
*/
