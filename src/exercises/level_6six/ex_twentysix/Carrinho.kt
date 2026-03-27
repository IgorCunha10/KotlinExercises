package exercises.level_6six.ex_twentysix

data class Carrinho(val produtos: Produtos, var quantidade: Int) {

    fun total():Double {
        var total = produtos.price * quantidade
        return total
    }

}