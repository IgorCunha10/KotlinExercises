package exercises.level_6six.ex_twentysix

private var choice: Boolean = false
private var total: Double = 0.0

fun main() {

    do {
        showProducts()
        typeChoice()
        
      } while (choice)

    }

        fun addProduct() {
            val product = Produtos<Int, String>()

            product.put(1, "Arroz")
            product.put(2, "Feijão")
            product.put(3, "Macarrão")
            product.put(4, "Ovos")
            product.put(5, "Frango")

        }

        fun typeChoice():Int {

            var inputChoice = readln().toInt()
            if (inputChoice <= 5) {
                println("Produto adicionado ao carrinho.")
                choice = true
            } else if (inputChoice == 6) {
                println("Finalizando pedido")
                println("Total: R$" + showTotal())
                choice = false
            } else {
                println("Produto inválido")
            }
            return inputChoice

        }

    fun showProducts() {
        println(" -- Aqui está nossa Lista de produtos -- ")
        println(" ** Digite o número do produto para adicionar ao carrinho **")

        println(" - 1 - Arroz")
        println(" - 2 - Feijão")
        println(" - 3 - Macarrão")
        println(" - 4 - Ovos")
        println(" - 5 - Frango")
        println(" - 6 - Finalizar pedido")
    }

//    fun sumProducts() {
//        var carrinho = Carrinho()
//
//    }

    fun showTotal():Double {

        return total
    }
