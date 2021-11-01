package com.qky.mvvmjumpstart.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.qky.mvvmjumpstart.R
import com.qky.mvvmjumpstart.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by navGraphViewModels(R.id.mainFragment)
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnNext.setOnClickListener {
            val dir = MainFragmentDirections.actionMainFragmentToSecondFragment()
            findNavController().navigate(dir)
        }
    }

}