package exercises.level_4four.level_fourteen


fun main() {

    var pessoaA = Pessoa("Jurandir", 60)
    var pessoaB = Pessoa("Enzo", 12)

    var diferencaIdade: Int

    if(pessoaA.idade > pessoaB.idade) {
        diferencaIdade = pessoaA.idade - pessoaB.idade
        println("${pessoaA.nome} é a pessoa mais velha")
        println("A diferença de idade entre as pessoas é de $diferencaIdade anos")
    } else if(pessoaB.idade > pessoaA.idade) {
        diferencaIdade = pessoaB.idade - pessoaA.idade
        println("${pessoaB.nome} é a pessoa mais velha")
        println("A diferença de idade entre as duas pessoas é de $diferencaIdade anos")
    } else {
        println("A idade das duas pessoas é a mesma")
    }

}