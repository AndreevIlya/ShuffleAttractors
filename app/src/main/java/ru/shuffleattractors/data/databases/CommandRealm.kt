package ru.shuffleattractors.data.databases

import com.google.gson.Gson
import io.realm.RealmModel
import io.realm.annotations.RealmClass
import ru.shuffleattractors.domain.entities.CommandEntity

@RealmClass
open class CommandRealm(): RealmModel {
    var iterationsCount: Int = 0
    var countModified: Int = 0
    var computerType: String? = null
    var modifiedArrayItems: String? = null

    constructor(entity: CommandEntity): this(){
        iterationsCount = entity.iterationsCount
        countModified = entity.countModified
        computerType = entity.computerType
        modifiedArrayItems = Gson().toJson(entity.modifiedArrayItems)
    }
}