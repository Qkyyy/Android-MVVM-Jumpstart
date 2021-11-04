package com.qky.mvvmjumpstart.usecases

import com.qky.mvvmjumpstart.repositories.DummyRepository
import javax.inject.Inject

class GetAnotherDummyData @Inject constructor(
    private val dummyRepository: DummyRepository
) {
    suspend operator fun invoke() = dummyRepository.getAnotherDummyData()
}