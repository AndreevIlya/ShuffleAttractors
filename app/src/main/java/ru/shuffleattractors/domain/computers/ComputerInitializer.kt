package ru.shuffleattractors.domain.computers

import ru.shuffleattractors.domain.entities.CommandEntity

open class ComputerInitializer(
    private val input: CommandEntity
) {
    fun initArray(): Array<Int> {
        var initSum = 0
        return Array(CommandEntity.DIMENSION) { i ->
            if (i < input.countModified) {
                initSum += input.modifiedArrayItems[i]
                input.modifiedArrayItems[i]
            } else {
                initSum++
                1
            }
        }
    }
}