// Project: Scala Developer Showcase
// File: Main.scala

object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Scala Developer Showcase Project!")

    // Sample feature: Calculator
    val calculator = new Calculator()
    println(s"Addition: 2 + 3 = ${calculator.add(2, 3)}")
    println(s"Multiplication: 4 * 5 = ${calculator.multiply(4, 5)}")

    // Sample feature: User Management
    val userManager = new UserManager()
    userManager.addUser("Alice", "alice@example.com")
    userManager.addUser("Bob", "bob@example.com")
    println("User list:")
    userManager.listUsers()
  }
}

// Calculator.scala
class Calculator {
  def add(a: Int, b: Int): Int = a + b

  def multiply(a: Int, b: Int): Int = a * b
}

// UserManager.scala
class UserManager {
  private var users: List[User] = List()

  def addUser(name: String, email: String): Unit = {
    users = users :+ User(name, email)
  }

  def listUsers(): Unit = {
    users.foreach(user => println(s"Name: ${user.name}, Email: ${user.email}"))
  }
}

case class User(name: String, email: String)
