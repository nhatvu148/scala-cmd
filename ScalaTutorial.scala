// package playground

import scala.math._
import scala.io.StdIn.{readLine, readInt}
import scala.collection.mutable.ArrayBuffer
import java.io._
import scala.io.Source

object ScalaTutorial extends App {
  val favNums = new Array[Int](20)

  val friends = Array("Bob", "Tom")

  friends(0) = "Sue"
  println("Best friends " + friends(0))

  val friends2 = ArrayBuffer[String]()

  friends2.insert(0, "Phil")
  friends2 += "Mark"
  friends2 ++= Array("Susy", "Paul")
  friends2.insert(1, "Mike")
  friends2.remove(1, 2)

  var friend: String = ""
  for (friend <- friends2)
    println(friend)

  for (j <- 0 to (favNums.length - 1)) {
    favNums(j) = j
    println(favNums(j))
  }

  val favNumsTimes2 = for (num <- favNums) yield 2 * num

  favNumsTimes2.foreach(println)

  var favNumsDiv4 = for (num <- favNums if num % 4 == 0) yield num

  favNumsDiv4.foreach((println))

  var multTable = Array.ofDim[Int](10, 10)
  for (i <- 0 to 9) {
    for (j <- 0 to 9) {
      multTable(i)(j) = i * j
    }
  }
  for (i <- 0 to 9) {
    for (j <- 0 to 9) {
      printf("%d : %d = %d\n", i, j, multTable(i)(j))
    }
  }

  println("Sum : " + favNums.sum)
  println("Max : " + favNums.max)
  println("Min : " + favNums.min)

  val sortedNums = favNums.sortWith((_ > _))
  println(sortedNums.mkString(", "))

  val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

  if (employees.contains("Manager"))
    printf("Manager : %s\n", employees("Manager"))

  val customers =
    collection.mutable.Map(100 -> "Paul Smith", 101 -> "Sally Smith")

  printf("Customer 1 : %s\n", customers(100))

  customers(100) = "Tom Marks"
  customers(102) = "Megan Swift"
  for ((k, v) <- customers)
    printf("%d : %s\n", k, v)

  val writer = new PrintWriter(new File("Test.txt"))
  writer.write("Just some random texts\nSome more random text")
  writer.close

  val textFromFile = Source.fromFile("Test.txt", "UTF-8")
  val lineIterator = textFromFile.getLines
  for (line <- lineIterator)
    println(line)
  textFromFile.close

  // def main(args: Array[String]): Unit = {
  // var numberGuess = 0
  // do {
  //   print("Guess a number: ")
  //   numberGuess = readLine().toInt
  // } while (numberGuess != 15)

  // printf("You guessed the secret number %d\n", 15)
  // val name = "Nhat Vu"
  // val age = 30
  // val weight = 60
  // println(s"Hello $name")
  // println(f"I am ${age + 1} and weigh $weight%.2f")
  // }

  //  val lgPrime = BigInt("342354365876897459867243597843985734857348579834759834758")
  //  println(lgPrime)
  //
  //  val piLarge = BigDecimal("3.14159265358979323846264338327950288419716939937510582097694339323781683248")
  //  println(piLarge)
  //
  //  println(abs(-123))
  //  println(cbrt(-123))
  //  println(round(-123.344234))
  //  println(floor(-123.231232))
  //  println(exp(1))
  //  println(pow(2, 2))
  //  println(log10(1000))
  //  println(log(2.7182818284590455))
  //  println(max(2, 3))
  //  println((random * (11 - 1) + 1).toInt)
  //
  //  var age = 19
  //  val canVote = if (age >= 18) "Yes" else "No"
  //  println(canVote)
  //
  //  var i = 0
  //  var evenList = for {i <- 1 to 20 if (i % 2 == 0)} yield i
  //  for (i <- evenList) println(i)
}
