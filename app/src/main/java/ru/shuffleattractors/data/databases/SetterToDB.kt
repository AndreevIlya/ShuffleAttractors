package ru.shuffleattractors.data.databases

interface SetterToDB<K,V> {
    fun insert(key: K, value: V)
    fun update(key: K, value: V)
}