package ru.shuffleattractors.domain.entities


data class ShuffleDatum(
    val iterationsCount: Int,
    val countModified: Int,
    val arrayModified: Array<Int>
) {
    val output: Array<Int> = computeResult()

    companion object {
        const val DIMENSION = 100
    }

    private fun computeResult(): Array<Int> {
        var initSum = 0
        val out = Array(DIMENSION) { i ->
            if (i < countModified) {
                initSum += arrayModified[i]
                arrayModified[i]
            } else {
                initSum++
                1
            }
        }
        for (i in 0 until iterationsCount) {
            val rand = (0 until initSum + i).random()
            var count = 0
            for (j in 0 until DIMENSION) {
                count += out[j]
                if (count > rand) {
                    out[j]++
                    break
                }
            }
        }
        return out
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ShuffleDatum

        if (countModified != other.countModified) return false
        if (!arrayModified.contentEquals(other.arrayModified)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = countModified
        result = 31 * result + arrayModified.contentHashCode()
        return result
    }
}