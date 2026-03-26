package exercises.level_6six.ex_twentyfive

class SimpleCache<K, V> {
    private val cache = mutableMapOf<K, V>()

    fun get(key: K): V? {
        return cache[key]
    }

    fun put(key: K, value: V) {
        cache[key] = value
    }

}