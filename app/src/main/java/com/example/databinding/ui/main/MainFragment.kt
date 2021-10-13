package com.example.databinding.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.databinding.R
import com.example.databinding.databinding.MainFragmentBinding


class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: MainFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.i("alain", "onCreateView")

        // Inflate the layout XML file and return a binding object instance
        //binding = MainFragmentBinding.inflate(inflater, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("alain", "onViewCreated")

        super.onViewCreated(view, savedInstanceState)

        binding.mainViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
    }
}