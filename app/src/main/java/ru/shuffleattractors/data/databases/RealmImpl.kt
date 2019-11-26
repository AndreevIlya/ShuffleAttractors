package ru.shuffleattractors.data.databases

import com.google.gson.Gson
import io.realm.Realm
import ru.shuffleattractors.domain.entities.CommandEntity
import ru.shuffleattractors.domain.entities.ResultEntity

class RealmImpl(val realm: Realm) : GetterFromDB<CommandEntity, ResultEntity> {
    override fun select(where: CommandEntity): ResultEntity {
        val wmai = Gson().toJson(where.modifiedArrayItems)
        val result = realm.where(ResultRealm::class.java)
            .equalTo("command.iterationsCount", where.iterationsCount)
            .equalTo("command.countModified", where.countModified)
            .equalTo("command.computerType", where.computerType)
            .equalTo("command.modifiedArrayItems", wmai)
            .findFirst()
        return realm.copyFromRealm(result!!).getResult()
    }
}