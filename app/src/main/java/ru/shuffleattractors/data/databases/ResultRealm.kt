package ru.shuffleattractors.data.databases

import io.realm.RealmModel
import io.realm.annotations.RealmClass

@RealmClass
open class ResultRealm() : RealmModel {

    private lateinit var command: CommandRealm
    private lateinit var result: String

    constructor(command: CommandRealm, output: String): this(){
        this.command = command
        result = output
    }
}