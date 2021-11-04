package com.qky.mvvmjumpstart.viewmodels

import androidx.lifecycle.ViewModel
import com.qky.mvvmjumpstart.usecases.GetAnotherDummyData
import com.qky.mvvmjumpstart.usecases.GetDummyData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.singleOrNull

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getDummyData: GetDummyData,
    private val getAnotherDummyData: GetAnotherDummyData
) : ViewModel() {

    suspend fun getDummy() = getDummyData()
        .catch {
            //handle the single exception
        }
        .singleOrNull()

    suspend fun getAnotherDummy() = getAnotherDummyData()
        .catch {
            //handle the single exception
        }
        .singleOrNull()
}