package ru.shuffleattractors.di.global

import android.app.Application
import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration
import javax.inject.Singleton

@Module
class RealmModule {

    companion object {
        const val DB_NAME = "shuffles.realm"
    }

    @Provides
    @Singleton
    fun provideRealmConfig(): RealmConfiguration = RealmConfiguration.Builder()
        .name(DB_NAME)
        .build()


    @Provides
    @Singleton
    fun provideRealm(context: Application, config: RealmConfiguration): Realm {
        Realm.init(context)
        return Realm.getInstance(config)
    }
}