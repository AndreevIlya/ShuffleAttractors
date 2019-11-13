package ru.shuffleattractors.domain.repositories

import ru.shuffleattractors.domain.entities.CommandEntity

interface Repository {
    fun getData(): CommandEntity
    fun setData(data: CommandEntity)
}