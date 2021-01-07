class User(var firstName: String, var lastName: String, var age: String) {

    var admin: String? = null
        set(value) {
            if(value == "Sergey")
                field = "Admin"
            else
                field = value
            println("Hello $field")
        }

    fun printUser() {
        println("Your name: $firstName")
        println("Your lastname: $lastName")
        println("Your age $age")
    }
}