package com.rowlandsj

class KarateChop {

    fun iterativeSearchChop(target: Int, array: IntArray): Int {
        return array.indexOfFirst { it == target }
    }

    fun recursiveChop(target: Int, array: IntArray): Int {
        return recursiveSearch(target, array, 0, array.lastIndex)
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
