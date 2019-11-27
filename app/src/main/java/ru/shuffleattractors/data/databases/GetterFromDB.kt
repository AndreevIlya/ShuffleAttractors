package ru.shuffleattractors.data.databases

interface GetterFromDB<W,Out> {
    fun select(where: W): Out
    fun check(where: W): Boolean
}