package ru.shuffleattractors.data.databases

import com.google.gson.Gson
import io.realm.RealmModel
import io.realm.annotations.RealmClass
import ru.shuffleattractors.domain.entities.CommandEntity
import ru.shuffleattractors.domain.entities.ResultEntity

@RealmClass
open class ResultRealm() : RealmModel {

    private lateinit var command: CommandRealm
    private lateinit var result: String

    private constructor(command: CommandRealm, result: String): this(){
        this.command = command
        this.result = result
    }

    fun getResultEntity(): ResultEntity{
        return ResultEntity(Gson().fromJson(result,Array<Int>::class.java))
    }

    companion object{
        fun convertToRealm(command: CommandRealm,
                           resultEntity: ResultEntity): ResultRealm{
            return ResultRealm(command,Gson().toJson(resultEntity))
        }
    }
}