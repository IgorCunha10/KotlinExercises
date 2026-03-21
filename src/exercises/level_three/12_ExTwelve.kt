package exercises.level_three

fun <T : Comparable<T>> MutableList<T>.bubbleSort () {
    val n = this.size
    var swapped: Boolean

    for (i in 0 until n - 1) {
        swapped = false

        for (j in 0 until n - i - 1) {
            if (this[j] > this[j + 1]) {

                val temp = this[j]
                this[j] = this[j + 1]
                this[j + 1] = temp
                swapped = true
            }
        }
        if (!swapped) break
    }

}


fun main() {

    //Bubble Sort Algorithm Implementation

    val list = mutableListOf<Int>(1, 22, 33, 56, 86, 2213, 5, 2)
    list.bubbleSort()
    println("Sorted list " + list)

    //Selection Sort Algorithm Implementation





}

