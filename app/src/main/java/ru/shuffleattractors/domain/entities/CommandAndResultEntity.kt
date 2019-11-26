package ru.shuffleattractors.domain.entities

data class CommandAndResultEntity(
    val command: CommandEntity,
    val result: ResultEntity) {
}