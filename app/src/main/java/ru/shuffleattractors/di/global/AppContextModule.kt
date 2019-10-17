package ru.shuffleattractors.di.global

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppContextModule {

    @Provides
    @Singleton
    fun provideAppContext(context: Application) = context
}