package com.qky.mvvmjumpstart.ui.main

import androidx.lifecycle.ViewModel
import com.qky.mvvmjumpstart.repositories.DummyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dummyRepository: DummyRepository
) : ViewModel() {
    fun getDummy() = dummyRepository.dummyProperty
}