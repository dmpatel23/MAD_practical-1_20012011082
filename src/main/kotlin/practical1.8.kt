fun main() {
    val unsortedArr = intArrayOf(3, 1, 4, 2, 5)
    val sortedArr= sortArray(unsortedArr)
    println("Sorted Array: ${sortedArr.contentToString()}")
}

fun sortArray(arr: IntArray): IntArray {
    val n = arr.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    return arr
}



/*fun main() {
    val unsortedArr = intArrayOf(3, 1, 4, 2, 5)


    val sortedArray = unsortedArr.sortedArray()
    println("Sorted Array: ${sortedArray.contentToString()}")
}*/
