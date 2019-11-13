package ru.shuffleattractors.di.global

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppContextModule(private val context: Application) {

    @Provides
    @Singleton
    fun provideAppContext() = context
}