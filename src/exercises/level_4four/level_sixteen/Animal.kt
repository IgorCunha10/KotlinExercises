package exercises.level_4four.level_sixteen

open class Animal (categoria: String){

    var sound: String = " "
    val categoria = categoria

    fun makeSound() {
        if(categoria == "Cachorro") {
            sound = "Au Au"
        } else if(categoria == "Gato"){
            sound = "Miau"
        } else {
            println("Animal desconhecido.")
        }
        println(sound)
    }
}