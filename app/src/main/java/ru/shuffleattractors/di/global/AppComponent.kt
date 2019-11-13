package ru.shuffleattractors.di.global

import dagger.Component
import ru.shuffleattractors.App
import javax.inject.Singleton

@Component(modules = [RealmModule::class, AppContextModule::class])
@Singleton
interface AppComponent {

    fun inject(app: App)
}