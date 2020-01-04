import java.util.*
 
fun main(args: Array<String>) {
    val list = intArrayOf(4,3,1,5,2,6,0)
    bubbleSort(list)
    list.forEach {
    	println(it)
    }
}

fun bubbleSort(numbers: IntArray) {
    for (pass in 0 until (numbers.size - 1)) {
        // A single pass of bubble sort
        for (currentPosition in 0 until (numbers.size - pass - 1)) {
            // This is a single step
            if (numbers[currentPosition] > numbers[currentPosition + 1]) {
                val tmp = numbers[currentPosition]
                numbers[currentPosition] = numbers[currentPosition + 1]
                numbers[currentPosition + 1] = tmp
            }
        }
    }
}
