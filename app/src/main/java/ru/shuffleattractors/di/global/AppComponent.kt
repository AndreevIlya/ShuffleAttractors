package ru.shuffleattractors.di.global

import dagger.Component
import javax.inject.Singleton

@Component(modules = [RealmModule::class, AppContextModule::class])
@Singleton
interface AppComponent {
}