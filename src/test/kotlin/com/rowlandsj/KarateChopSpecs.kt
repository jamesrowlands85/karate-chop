package com.rowlandsj

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(JUnitPlatform::class)
class KarateChopSpecs : Spek({

    describe("a karate iterativeSearchChop") {

        val karateChop = KarateChop()

        it("should return -1 when passed an empty array") {
            val array: IntArray = intArrayOf()
            val result = karateChop.iterativeSearchChop(3, array)
            assertEquals(-1, result)
        }

        it("should return -1 when the target is 3 and the passed array contains only the number 1") {
            val array: IntArray = intArrayOf(1)
            val result = karateChop.iterativeSearchChop(3, array)
            assertEquals(-1, result)
        }

        it("should return 0 when the target is 1 and the passed array contains the number 1 at index 0") {
            val array: IntArray = intArrayOf(1)
            val result = karateChop.iterativeSearchChop(1, array)
            assertEquals(0, result)
        }

        it("should return 1 when the target is 3 and the passed array contains the number 3 at index 1") {
            val array: IntArray = intArrayOf(1,3,5)
            val result = karateChop.iterativeSearchChop(3, array)
            assertEquals(1, result)
        }
    }

    describe("a karate recursiveChop") {
        val karateChop = KarateChop()

        it("should return -1 when searching an empty array") {
            val array: IntArray = intArrayOf()
            val result = karateChop.recursiveChop(11, array)
            assertEquals(-1, result)
        }

        it("should return -1 when the number requested is not in the array") {
            val array: IntArray = intArrayOf(3,6,7,8,9,10)
            val result = karateChop.recursiveChop(11, array)
            assertEquals(-1, result)
        }

        it("should return 2 when the number requested is at index 2 in the array") {
            val array: IntArray = intArrayOf(3,6,7,8,9,10)
            val result = karateChop.recursiveChop(7, array)
            assertEquals(2, result)
        }

        it("should return 3 when the number requested is at index 3 in the array") {
            val array: IntArray = intArrayOf(3,6,7,8,9,10,11)
            val result = karateChop.recursiveChop(8, array)
            assertEquals(3, result)
        }
    }
})