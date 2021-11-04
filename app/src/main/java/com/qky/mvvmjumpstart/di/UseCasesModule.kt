package com.qky.mvvmjumpstart.di

import com.qky.mvvmjumpstart.repositories.DummyRepository
import com.qky.mvvmjumpstart.usecases.GetAnotherDummyData
import com.qky.mvvmjumpstart.usecases.GetDummyData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object UseCasesModule {
    @Provides
    @Singleton
    fun provideGetDummyData(dummyRepository: DummyRepository) : GetDummyData {
        return GetDummyData(dummyRepository)
    }

    @Provides
    @Singleton
    fun provideGetAnotherDummyData(dummyRepository: DummyRepository) : GetAnotherDummyData {
        return GetAnotherDummyData(dummyRepository)
    }
}