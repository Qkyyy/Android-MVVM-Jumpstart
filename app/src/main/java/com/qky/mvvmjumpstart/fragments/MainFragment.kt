package com.qky.mvvmjumpstart.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.hilt.navigation.fragment.hiltNavGraphViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.qky.mvvmjumpstart.R
import com.qky.mvvmjumpstart.databinding.MainFragmentBinding
import com.qky.mvvmjumpstart.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import ru.ldralighieri.corbind.view.clicks
import timber.log.Timber

@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel: MainViewModel by hiltNavGraphViewModels(R.id.mainFragment)
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        lifecycleScope.launch {
            Toast.makeText(requireContext(), viewModel.getDummy(), Toast.LENGTH_LONG).show()
        }

        binding.btnNext.clicks()
            .map { MainFragmentDirections.actionMainFragmentToSecondFragment() }
            .onEach { findNavController().navigate(it) }
            .onEach { Timber.d("btn clicked") }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

}