package ru.shuffleattractors

import org.junit.Test

import org.junit.Assert.*
import ru.shuffleattractors.domain.entities.ShuffleDatum

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun shuffleOutputGeneration() {
        val datum = ShuffleDatum(100000,4,arrayOf(5,10,0,5))
        for(o in datum.output)
        print("$o, ")
    }
}
