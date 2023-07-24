fun main() {
    val numberList = arrayListOf(10, 5, 20, 15, 30)
    val maxNumber = numberList.max()
    if (maxNumber != null) {
        println("The maximum number is: $maxNumber")
    } else {
        println("The list is empty.")
    }
}