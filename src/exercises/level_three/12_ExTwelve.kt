package exercises.level_three

import kotlin.math.min

fun main() {

    //Bubble Sort Algorithm Implementation

    val list = mutableListOf<Int>(1, 22, 33, 56, 86, 2213, 5, 2)
    list.bubbleSort()
    println("Bubble Sorted list " + list)

    //Selection Sort Algorithm Implementation

    selectionSort(list)
    println("Selection Sorted list " + list)

    //Quick Sort Algorithm Implementation

    val intListArr = intArrayOf(1, 22, 33, 56, 86, 2213, 5, 2)
    //expected = [1, 2, 4, 22, 33, 56, 86, 2213]

    quickSort(intListArr, 0, intListArr.size - 1)
    println("Quick Sorted list " + "[" + intListArr.joinToString(", ") + "]")

}

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

fun selectionSort(arr: MutableList<Int>) {

    val n = arr.size

    for(i in 0 until n - 1) {
        var minIndex = i

        for (j in i + 1 until n) {
            if (arr[j] < arr[minIndex]) {

                minIndex = j

            }
        }

        val temp = arr[i]
        arr[i] = arr[minIndex]
        arr[minIndex] = temp
    }
}

fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(arr, low, high)
        quickSort(arr, low, pivotIndex - 1)
        quickSort(arr, pivotIndex + 1, high)
    }
}

fun partition(arr: IntArray, low:Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1

    for (j in low until high) {
        if (arr[j] <= pivot) {
            i++
            swap(arr, i, j)
        }
    }

    swap(arr, i + 1, high)
    return i + 1
}

fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}
