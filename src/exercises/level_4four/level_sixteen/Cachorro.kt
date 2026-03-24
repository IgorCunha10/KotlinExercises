package exercises.level_4four.level_sixteen

class Cachorro(categoria: String): Animal(categoria) {

}

fun main() {
    val cachorro = Cachorro("Cachorro")
    cachorro.makeSound()
}