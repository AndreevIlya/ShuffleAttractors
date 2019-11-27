package ru.shuffleattractors.data.databases

import com.google.gson.Gson
import io.realm.Realm
import io.realm.RealmQuery
import io.realm.kotlin.deleteFromRealm
import ru.shuffleattractors.domain.entities.CommandEntity
import ru.shuffleattractors.domain.entities.ResultEntity

class RealmImpl(val realm: Realm) :
    GetterFromDB<CommandEntity, ResultEntity>,
    SetterToDB<CommandEntity, ResultEntity>,
    Deleter<CommandEntity> {
    override fun select(where: CommandEntity): ResultEntity {
        val result = buildSelectQuery(where).findFirst()
        return realm.copyFromRealm(result!!).getResultEntity()
    }

    override fun check(where: CommandEntity)= buildSelectQuery(where).count() != 0L

    override fun insert(key: CommandEntity, value: ResultEntity) {
        realm.beginTransaction()
        val command = CommandRealm.convertToRealm(key)
        val result = ResultRealm.convertToRealm(command, value)
        realm.insertOrUpdate(result)
        realm.commitTransaction()
    }

    override fun update(key: CommandEntity, value: ResultEntity) {
        this.insert(key, value)
    }

    override fun delete(where: CommandEntity) {
        val result = buildSelectQuery(where).findFirst()
        realm.executeTransaction { result?.deleteFromRealm() }
    }

    private fun buildSelectQuery(where: CommandEntity): RealmQuery<ResultRealm> {
        val wmai = Gson().toJson(where.modifiedArrayItems)
        return realm.where(ResultRealm::class.java)
            .equalTo("command.iterationsCount", where.iterationsCount)
            .equalTo("command.countModified", where.countModified)
            .equalTo("command.computerType", where.computerType)
            .equalTo("command.modifiedArrayItems", wmai)
    }
}