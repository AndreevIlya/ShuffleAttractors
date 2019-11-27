package ru.shuffleattractors.data.databases

import com.google.gson.Gson
import io.realm.RealmModel
import io.realm.annotations.RealmClass
import ru.shuffleattractors.domain.entities.CommandEntity

@RealmClass
open class CommandRealm(): RealmModel {
    var iterationsCount: Int = 0
    var countModified: Int = 0
    lateinit var computerType: String
    lateinit var modifiedArrayItems: String

    private constructor(entity: CommandEntity): this(){
        iterationsCount = entity.iterationsCount
        countModified = entity.countModified
        computerType = entity.computerType
        modifiedArrayItems = Gson().toJson(entity.modifiedArrayItems)
    }

    companion object{
        fun convertToRealm(entity: CommandEntity): CommandRealm{
            return CommandRealm(entity)
        }
        fun convertFromRealm(command: CommandRealm): CommandEntity{
            return CommandEntity(
                command.iterationsCount,
                command.countModified,
                command.computerType,
                Gson().fromJson(command.modifiedArrayItems,Array<Int>::class.java))
        }
    }
}