package exercises.level_three

fun main() {

    //Bubble Sort Algorithm Implementation

    var t: Int
    var a: IntArray = intArrayOf(40, 20, 50, 10, 30)

    println("Unsorted Numbers")
    for(i in 0..4) {
        print(" " + a[i])
    }

    for(i in 0..4) {
        for (j in 1..(4-i)) {
            if(a[j - 1] > a[j]) {

                t = a[j - 1]
                a[j - 1] = a[j]
                a[j] = t

            }
        }
    }

    println()
    println("Sorted numbers")
        for (i in 0..4) {
            print(" " + a[i])
        }



    }

