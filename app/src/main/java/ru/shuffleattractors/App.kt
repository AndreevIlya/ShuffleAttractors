package ru.shuffleattractors

import android.app.Application
import io.realm.Realm
import ru.shuffleattractors.di.global.AppComponent
import ru.shuffleattractors.di.global.AppContextModule
import ru.shuffleattractors.di.global.DaggerAppComponent
import ru.shuffleattractors.di.global.RealmModule
import javax.inject.Inject

class App: Application() {

    lateinit var appComponent: AppComponent

    @Inject
    lateinit var realm : Realm

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .appContextModule(AppContextModule(this))
            .realmModule(RealmModule())
            .build()
        appComponent.inject(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        realm.close()
    }
}