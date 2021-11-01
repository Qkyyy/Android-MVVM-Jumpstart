package com.qky.mvvmjumpstart.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.qky.mvvmjumpstart.R

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by navGraphViewModels(R.id.mainFragment)
    private lateinit var btnNext: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnNext = view.findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val dir = MainFragmentDirections.actionMainFragmentToSecondFragment()
            findNavController().navigate(dir)
        }
    }

}