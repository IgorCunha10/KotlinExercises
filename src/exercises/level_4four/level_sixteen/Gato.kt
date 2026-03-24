package exercises.level_4four.level_sixteen

class Gato(categoria: String): Animal(categoria) {

}

fun main() {
    var gato = Gato("Gato")
    gato.makeSound()
}