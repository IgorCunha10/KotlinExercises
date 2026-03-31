package exercises.level_6six.ex_twentyseven

import kotlin.random.Random


fun main() {

    playGame()
    getUserChoice()

}

fun getUserChoice() {

    println("Deseja jogar outra vez?")
    val userChoice = readln()

    do {
        if (userChoice == "Sim") {
            playGame()
        } else if (userChoice == "Não") {
            println("Fim de Jogo!")

        }
    } while (userChoice == "Sim")
}

fun playGame() {

    val randomNumber = Random.nextInt(0, 10)

    do {
        println("Tente adivinhar o número de 0 a 10:")
        var userGuess = readln().toInt()
        if (userGuess == randomNumber) {
            println("Parabéns, você acertou o número")
        } else if(randomNumber <= 5){
            println("Você errou, tente novamente")
            println("DICA: O número está no intervalo entre 0 e 5")
        } else if (randomNumber > 5) {
            println("DICA: O número está no intervalo entre 6 e 10")
        }

    } while (userGuess != randomNumber)
}