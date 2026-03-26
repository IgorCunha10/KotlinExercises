package exercises.level_6six.ex_twentyfive

fun main() {
    val userCache = SimpleCache<Int, String>()

    userCache.put(1, "Alex")
    userCache.put(2, "Éderson")

    println(userCache.get(1))
    println(userCache.get(2))
}