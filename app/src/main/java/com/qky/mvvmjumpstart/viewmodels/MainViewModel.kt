package com.qky.mvvmjumpstart.viewmodels

import androidx.lifecycle.ViewModel
import com.qky.mvvmjumpstart.repositories.DummyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.singleOrNull

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dummyRepository: DummyRepository
) : ViewModel() {

    suspend fun getDummy() = dummyRepository.getDummyData()
        .catch {
            //handle the single exception
        }
        .singleOrNull()
}