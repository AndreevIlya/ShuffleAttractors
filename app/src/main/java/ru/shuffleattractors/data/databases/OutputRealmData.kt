package ru.shuffleattractors.data.databases

import io.realm.RealmModel
import io.realm.annotations.RealmClass

@RealmClass
open class OutputRealmData() : RealmModel {

    private lateinit var command: CommandRealmData
    private lateinit var result: String

    constructor(command: CommandRealmData, output: String): this(){
        this.command = command
        result = output
    }
}