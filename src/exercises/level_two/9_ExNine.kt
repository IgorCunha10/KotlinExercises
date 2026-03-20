package exercises.level_two

fun main() {

    println("Digite um número para calcular o seu fatorial: ")
    val num = readln()
    var numConv = num.toInt()
    var fatorial = 1

    if(numConv < 0 ) {
        println("Não foi possível calcular o fatorial!")
    } else if(numConv == 0 ) {
        println("O fatorial de 0 é: 1")
    } else {
        while (numConv > 0) {
            fatorial = fatorial * numConv
            numConv--
        }
        println("O fatorial de " + num + " é: " + fatorial)
    }

    }
