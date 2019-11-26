package ru.shuffleattractors.domain.computers

import ru.shuffleattractors.domain.entities.ResultEntity

interface Computer {
    fun computeResult(): ResultEntity
}