package com.example.clone1instagram.naviAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.clone1instagram.AddFragment
import com.example.clone1instagram.HomeFragment
import com.example.clone1instagram.SearchFragment
import com.example.clone1instagram.UserFragment

class NaviAdapter(fm : FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int = fragmentCount

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return HomeFragment()
            1 -> return SearchFragment()
            2 -> return AddFragment()
            3 -> return AddFragment()
            4 -> return UserFragment()
            else -> return HomeFragment()
        }
    }
}