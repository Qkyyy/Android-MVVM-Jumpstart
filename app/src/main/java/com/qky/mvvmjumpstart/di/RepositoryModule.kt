package com.qky.mvvmjumpstart.di

import com.qky.mvvmjumpstart.repositories.DummyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {
    @Provides
    @Singleton
    fun provideDummyRepository(): DummyRepository {
        return DummyRepository()
    }
}