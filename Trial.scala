object Trial extends App {
  val x = (1 to 10000).toList
  val y = x.reduce(_ + _)

  println(x)
  println(y)
}
