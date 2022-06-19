package com.example.diceroll

import com.example.diceroller.Dice
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generatesNumber() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("value was not within limits",rollResult in 1..6)
    }
}
