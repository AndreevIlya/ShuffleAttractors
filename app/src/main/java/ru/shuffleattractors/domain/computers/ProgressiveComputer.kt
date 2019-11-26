package ru.shuffleattractors.domain.computers

import ru.shuffleattractors.domain.entities.CommandEntity
import ru.shuffleattractors.domain.entities.CommandEntity.Companion.DIMENSION
import ru.shuffleattractors.domain.entities.ResultEntity

class ProgressiveComputer(
    private val input: CommandEntity
): ComputerInitializer(input), Computer {

    override fun computeResult(): ResultEntity {
        val out = initArray()
        val initSum = out.sum()
        for (i in 0 until input.iterationsCount) {
            val rand = (0 until initSum + i).random()
            var count = 0
            for (j in 0 until DIMENSION) {
                count += out[j]
                if (count > rand) {
                    out[j]++
                    break
                }
            }
        }
        return ResultEntity(out)
    }
}