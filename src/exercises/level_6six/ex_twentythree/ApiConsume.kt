package exercises.level_6six.ex_twentythree

fun main() {

    var users = DataApi("consumeApi")

    println("The actual list of users are:")
    println(users.userList)

    println("Users emails: ")
    println(users.userEmail)

    println("Users ages:")
    println(users.userAge)

    println("Users countries:")
    println(users.userCountry)

}