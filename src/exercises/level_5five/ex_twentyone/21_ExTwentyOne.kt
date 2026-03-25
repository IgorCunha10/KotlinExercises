package exercises.level_5five.ex_twentyone

fun main() {

    val division: Double = try {
        division()
    } catch (e: ArithmeticException) {
        0.0
    }
    println(division)
}

fun division(): Double {
    println("Digite o numerador")
    val a = readln().toDouble()

    println("Digite o denominador")
    val b = readln().toDouble()

    return a / b

}


