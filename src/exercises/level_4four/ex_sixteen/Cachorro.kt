package exercises.level_4four.ex_sixteen

class Cachorro: Animal {

    constructor(nome:String, idade: Int, peso: Double, cor: String) : super(nome, idade, peso, cor)

    override fun makeSound() {
        println("Au Au")
    }
}

