class UserManager {
  private var users: List[User] = List()

  def addUser(name: String, email: String): Unit = {
    users = users :+ User(name, email)
  }

  def listUsers(): Unit = {
    users.foreach(user => println(s"Name: ${user.name}, Email: ${user.email}"))
  }
}
