package exercises.level_6six.ex_twentyseven

import kotlin.random.Random


fun main() {

    playGame()
    getUserChoice()

}

fun getUserChoice() {

    println("Deseja jogar outra vez?")
    val userChoice = readln()
    var playAgain = false

    do {
        if (userChoice == "Sim") {
            playGame()
            playAgain = true
        } else if (userChoice == "Não") {
            println("Fim de Jogo!")
            playAgain = false
        }
    } while (playAgain)
}

fun playGame() {

    val randomNumber = Random.nextInt(0, 10)

    do {
        println("Tente adivinhar o número de 0 a 10:")
        var userGuess = readln().toInt()
        if (userGuess == randomNumber) {
            println("Parabéns, você acertou o número")
        } else {
            println("Você errou, tente novamente")
        }

    } while (userGuess != randomNumber)
}