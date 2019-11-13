package ru.shuffleattractors.domain.entities


data class CommandEntity(
    val iterationsCount: Int,
    val countModified: Int,
    val computerType: String,
    val modifiedArrayItems: Array<Int>
) {

    companion object {
        const val DIMENSION = 100
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CommandEntity

        if (iterationsCount != other.iterationsCount) return false
        if (countModified != other.countModified) return false
        if (!modifiedArrayItems.contentEquals(other.modifiedArrayItems)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = iterationsCount
        result = 31 * result + countModified
        result = 31 * result + modifiedArrayItems.contentHashCode()
        return result
    }
}