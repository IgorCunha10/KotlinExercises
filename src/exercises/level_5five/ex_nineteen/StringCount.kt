package exercises.level_5five.ex_nineteen

fun main() {

    println("Type a word: ")
    var userWord = readln().toString()

    var vowelCount = vowelCounter(userWord)
    var consonants = userWord.length - vowelCount

    println("The number of vowels in the word sent is: $vowelCount")
    println("The number of consonants in the word sent is: $consonants")

}


fun vowelCounter(word: String): Int {

    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var counter = 0
    val wordToLower = word.lowercase()

    for (i in wordToLower) {
        if (i in vowels) {
            counter++
        }
    }
    return counter
}
