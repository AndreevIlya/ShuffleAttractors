package ru.shuffleattractors

import android.app.Application
import ru.shuffleattractors.di.global.AppComponent
import ru.shuffleattractors.di.DaggerAppComponent
import ru.shuffleattractors.di.global.RealmModule

class App: Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .realmModule(RealmModule())
            .build()
    }

    override fun onTerminate() {
        super.onTerminate()

    }
}