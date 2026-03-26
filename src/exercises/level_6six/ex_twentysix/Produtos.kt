package exercises.level_6six.ex_twentysix

class Produtos<K, V>( ) {

    private val product = mutableMapOf<K, V>()

    fun get(key: K): V? {
        return product[key]
    }

    fun put(key: K, value: V) {
        product[key] = value
    }
}
