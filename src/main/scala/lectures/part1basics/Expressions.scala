package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4) // EXPRESSION

  println(1 == x)

  println(!(1 == x)) // NEGATION

  println(!(1 == x) && (1 == x)) // NEGATION AND LOGICAL AND

  println(!(1 == x) || (1 == x)) // NEGATRION AND LOGICAL OR

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE AND OR A TYPE)

  // IF exrpession

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION NOT AN IF INSTRUCTION
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
    // NEVER WRITE THIS AGAIN
    // EVERYTHING in Scala is an Expression
  }

  val aWeirdValue = (aVariable = 3) // Unit == void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning of VARS
  // these expressions return Unit == void

  // CODE BLOCKS
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  /* Basic expressions: operators
    - IF in Scala is an expression
    - CODE BLOCKS in Scala are expressions
      - the value of the block is the value of its last expression
    - Expressions vs Instructions
      - instructions are executed, expressions are evaluated
      - expressions are like: give me the value of something
      - in Scala we'll think more about expression
    - Do NOT use while loops in your Scala code
  */

  // 1. difference between "hello world" vs println("hello world")?

  val someValue ={
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println(someValue)
  println(someOtherValue)
}
