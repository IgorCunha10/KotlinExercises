package exercises.level_4four.ex_sixteen

open class Animal(nome1: String, idade1: Int, peso1: Double, cor1: String) {

    val nome: String = ""
    var idade: Int = 0
    var peso: Double = 0.0
    var cor: String = ""

    open fun makeSound() {
        println("Fazendo som")
    }

}