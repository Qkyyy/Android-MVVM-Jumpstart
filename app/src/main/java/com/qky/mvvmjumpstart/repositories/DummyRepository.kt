package com.qky.mvvmjumpstart.repositories

import javax.inject.Singleton
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext

@Singleton
class DummyRepository {
    suspend fun getDummyData(): Flow<String> = withContext(Dispatchers.IO) {
        flow {
            emit("dummy data") //mock API call
        }
    }
}