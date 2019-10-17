package ru.shuffleattractors.data.database

import ru.shuffleattractors.domain.entities.ShuffleDatum

class RealmProvider : DBProvider<ShuffleDatum,ShuffleDatum> {
    override fun insert(t: ShuffleDatum) {
        val datum = ShuffleDatum(10,2,arrayOf(1,2))
    }

    override fun update(t: ShuffleDatum) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(t: ShuffleDatum) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun select(t: ShuffleDatum): ShuffleDatum {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}