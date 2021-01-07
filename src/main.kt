fun sayHello(name: String?): Unit {
    if(name != null && name != "")
        println("Hello ${name}")
    else
        println("Hello")
}

fun myAge(age: String?):Unit {
    if(age != null && age != "")
        println("Your age - ${age}")
    else
        println("Your age is unknown")
}

fun myCity(city: String?): Unit {
    if(city != null && city != "")
        println("Your city - ${city}")
    else
        println("Your city is unknown")
}

 fun main(args: Array<String>) {
    println("Enter your name:")
    var name: String? = readLine()
     println("Enter your age:")
     var age: String? = readLine()
     println("Enter your city:")
     var city: String? = readLine()
     sayHello(name)
     myAge(age)
     myCity(city)
 }