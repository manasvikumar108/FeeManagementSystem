package com.example.feesmanagementsystem.Models

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.feesmanagementsystem.Home3

class student_viewPager (fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        val bundle = Bundle()
        when (position) {
            0 -> {
                val fragment = Home3()
                fragment.arguments = bundle
                return fragment
            }
            1 -> {
                val fragment = Home4()
                fragment.arguments = bundle
                return fragment
            }
            else -> throw IllegalStateException("Invalid position $position")
        }

    }
    override fun getCount(): Int {
        return 2
    }
    override fun getPageTitle(position: Int): CharSequence? {
        var title: String?= null

        if(position==0)
            title="Student details"
        else if (position==1)
            title="Pay"

        return title
    }
}