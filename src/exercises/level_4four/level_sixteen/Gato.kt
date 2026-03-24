package exercises.level_4four.level_sixteen

class Gato : Animal {
    constructor(nome: String, idade: Int, peso: Double, cor: String) : super(nome, idade, peso, cor)

    override fun makeSound() {
        println("Miau")
    }
}

