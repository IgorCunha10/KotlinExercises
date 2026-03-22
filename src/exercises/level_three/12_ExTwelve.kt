package exercises.level_three

import kotlin.math.min

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

fun quickSort(arr: IntArray, left: Int = 0, right: Int = arr.size - 1): IntArray {
        var start = left
        var end = right
        val pivot = arr[(left + right) / 2]

    while (start <= end) {
        while (arr[start] < pivot) {
            start++
        }
        while (arr[end] > pivot) {
            end--
        }
    if (start <= end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
    }

    if (left < end) {
        quickSort(arr, left, end)
    }
    if (start < right) {
        quickSort(arr, start, right)
    }
    return arr

}


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

    val expected = intArrayOf(1, 2, 4, 22, 33, 56, 86, 2213)
    quickSort(intListArr)
    println("Quick Sorted list " + intListArr)

}

fun assertArrayEquals(expected: IntArray, quickSort: IntArray) {}

