package ru.shuffleattractors.domain.computers

import ru.shuffleattractors.domain.entities.CommandEntity
import ru.shuffleattractors.domain.entities.CommandEntity.Companion.DIMENSION
import ru.shuffleattractors.domain.entities.ResultEntity

class UniformComputer(
    private val input: CommandEntity
): ComputerInitializer(input), Computer {

    override fun computeResult(): ResultEntity {
        val out = initArray()
        for (i in 0 until input.iterationsCount) {
            val rand = (0 until DIMENSION).random()
            out[rand]++
        }
        return ResultEntity(out)
    }
}