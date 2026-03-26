package exercises.level_6six.ex_twentythree

data class DataApi(val apiName:String) {

    class DataApi (val username: String, var age: Int, val email:String,
                   val country: String) {

    }

    var userA = DataApi("Fernando", 22, "fernando@gmail.com",
        "Brazil")

    var userB = DataApi("João", 24, "joaozinho@hotmail.com",
        "Brazil")

    var userC = DataApi("Bam Adebayo", 30, "badebayo@mymail.com",
        "United States")

    var userD = DataApi("Robert Swiatek", 25, "robertswiatek@outlook.com",
        "Poland")

    var userList = arrayOf(userA.username, userB.username, userC.username, userD.username).toSet()
    val userEmail = arrayOf(userA.email, userB.email, userC.email, userD.email).toSet()
    val userAge = arrayOf(userA.age, userB.age, userC.age, userD.age).toSet()
    val userCountry = arrayOf(userA.country, userB.country, userC.country, userD.country).toSet()


}