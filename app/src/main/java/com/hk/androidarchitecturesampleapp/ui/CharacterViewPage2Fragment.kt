package com.hk.androidarchitecturesampleapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.hk.androidarchitecturesampleapp.databinding.CharacterViewpager2FragmentBinding
import com.hk.androidarchitecturesampleapp.utils.autoCleared
import kotlinx.android.synthetic.main.character_viewpager2_fragment.*

class CharacterViewPage2Fragment : Fragment() {

    private var binding: CharacterViewpager2FragmentBinding by autoCleared()
    private lateinit var mCharacterViewPagerAdapter: CharacterViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = CharacterViewpager2FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewPage2()
    }

    private fun setUpViewPage2() {

        mCharacterViewPagerAdapter = activity?.let { CharacterViewPagerAdapter(it, 3) }!!
        characterViewPager.adapter = mCharacterViewPagerAdapter

        TabLayoutMediator(tab_layout, characterViewPager) { tab, position ->
            tab.text = "Character ${(position + 1)}"
        }.attach()
    }
}