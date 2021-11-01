package com.qky.mvvmjumpstart.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.navGraphViewModels
import com.qky.mvvmjumpstart.R

class SecondFragment : Fragment() {
    private val viewModel: MainViewModel by navGraphViewModels(R.id.secondFragment)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.second_fragment, container, false)
    }
}