package ru.shuffleattractors.domain.repositories

import ru.shuffleattractors.domain.entities.CommandAndResultEntity
import ru.shuffleattractors.domain.entities.CommandEntity
import ru.shuffleattractors.domain.entities.ResultEntity

interface Repository {
    fun getData(entity: CommandEntity): ResultEntity
    fun setData(entity: CommandAndResultEntity)
}