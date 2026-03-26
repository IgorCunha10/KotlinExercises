package exercises.level_6six.ex_twentyfour
//TODO refaça
suspend fun main() {
    showUserInfo()
}

suspend fun showUserInfo() {
    println("Loading information...")
    greet()
//    delay(1L)
    println("User: Igor Cunha")
}

suspend fun greet() {
    println("Hello!")
}

suspend fun delay(timeMillis: Long) {

}