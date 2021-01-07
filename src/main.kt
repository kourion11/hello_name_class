fun main(args: Array<String>) {
    val user = User("Name", "LastName", "Age")
    user.printUser()
    user.admin = user.firstName
}