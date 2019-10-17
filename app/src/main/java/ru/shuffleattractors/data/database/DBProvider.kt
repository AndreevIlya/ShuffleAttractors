package ru.shuffleattractors.data.database

interface DBProvider<T,R> {
    fun insert(t : T)
    fun update(t: T)
    fun delete(t: T)
    fun select(t: T): R
}