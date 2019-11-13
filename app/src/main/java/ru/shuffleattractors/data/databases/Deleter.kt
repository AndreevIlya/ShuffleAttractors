package ru.shuffleattractors.data.databases

interface Deleter<W> {
    fun delete(where: W)
}