package ru.shuffleattractors.domain.entities

data class ResultEntity(val result: Array<Int>) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResultEntity

        if (!result.contentEquals(other.result)) return false

        return true
    }

    override fun hashCode(): Int {
        return result.contentHashCode()
    }
}