package com.qky.mvvmjumpstart.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import com.qky.mvvmjumpstart.R
import com.qky.mvvmjumpstart.databinding.SecondFragmentBinding
import com.qky.mvvmjumpstart.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment : Fragment() {
    private val viewModel: MainViewModel by hiltNavGraphViewModels(R.id.secondFragment)
    private lateinit var binding: SecondFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = SecondFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}