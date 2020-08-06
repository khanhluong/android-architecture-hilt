package com.hk.androidarchitecturesampleapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hk.androidarchitecturesampleapp.databinding.ScreenSlidePageFragmentBinding
import com.hk.androidarchitecturesampleapp.utils.autoCleared

class ScreenSlidePageFragment: Fragment() {

    private var binding: ScreenSlidePageFragmentBinding by autoCleared()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ScreenSlidePageFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}