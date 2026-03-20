package exercises.level_two

fun main() {

    println("Digite um número para checar se ele é primo:")

    val num = readln()
    val numConv = num.toInt()

    var i = 2
    var isPrime = true

    if(numConv <= 1) {
        isPrime = false
    } else {
        while(i * i <= numConv) {
            if(numConv % i == 0) {1
                isPrime = false
            }
            i++
        }

    }

    if (isPrime) {
        println("O número enviado é primo")
    } else {
        println("O número enviado não é primo")
    }


}