package ru.shuffleattractors.data.databases

import com.google.gson.Gson
import io.realm.RealmModel
import io.realm.annotations.RealmClass
import ru.shuffleattractors.domain.entities.ResultEntity

@RealmClass
open class ResultRealm() : RealmModel {

    private lateinit var command: CommandRealm
    private lateinit var result: String

    constructor(command: CommandRealm, result: String): this(){
        this.command = command
        this.result = result
    }

    fun getResult(): ResultEntity{
        return ResultEntity(Gson().fromJson(result,Array<Int>::class.java))
    }
}