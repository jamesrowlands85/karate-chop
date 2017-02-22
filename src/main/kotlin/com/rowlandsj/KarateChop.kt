package com.rowlandsj

class KarateChop {

    fun iterativeSearchChop(target: Int, array: IntArray): Int {
        return array.indexOfFirst { it == target }
    }

    fun recursiveChop(target: Int, array: IntArray): Int {
        return recursiveSearch(target, array, 0, array.lastIndex)
    }

    fun binarySearchChop(target: Int, array: IntArray) : Int {
        var low = 0
        var high = array.lastIndex

        while(low <= high) {
            val mid = (high + low) / 2
            val midValue = array[mid]

            if(midValue < target) {
                low = mid + 1
            }
            else if(midValue > target) {
                high = mid - 1
            }
            else {
                return mid
            }
        }
        return -1
    }

    private fun recursiveSearch(target: Int, array: IntArray, start: Int, end: Int): Int {
        if(end < start) {
            return -1
        }

        val mid: Int = (start + end) / 2

        if(target == array[mid]) {
            return mid
        } else if (target < array[mid]) {
            return recursiveSearch(target, array, start, mid - 1)
        } else {
            return recursiveSearch(target, array, mid + 1, end)
        }

    }

}
