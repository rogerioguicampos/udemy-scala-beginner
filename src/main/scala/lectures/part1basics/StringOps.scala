package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(1))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a' +: aNumberString :+ 'z')
  println(str.reverse)

  // S-Interpolators
  val name = "Rogerio"
  val age = 31
  println(s"Hello, my name is $name and I'm $age years old.")
  println(s"Hello, my name is $name and I will be turning ${age + 1} years old.")

  // F-Interpolators
  val speed = 1.2f
  println(f"$name can eat $speed%2.2f burgers per minute")

  // Raw-Interpolators

}
