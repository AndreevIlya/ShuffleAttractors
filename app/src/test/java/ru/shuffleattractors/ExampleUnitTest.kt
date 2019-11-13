package ru.shuffleattractors

import org.junit.Test

import ru.shuffleattractors.domain.entities.CommandEntity

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun shuffleOutputGeneration() {
        val datum = CommandEntity(100000,4,arrayOf(5,10,0,5))
        for(o in datum.output)
        print("$o, ")
    }
}
