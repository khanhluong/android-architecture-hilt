package com.hk.androidarchitecturesampleapp.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hk.androidarchitecturesampleapp.ui.characters.CharactersFragment

class CharacterViewPagerAdapter(activity: FragmentActivity, private val itemsCount: Int) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment = CharactersFragment()

}