package com.example.intentoslide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.intentoslide.fragments.*

class MainActivity : AppCompatActivity() {

    var pagerAdapter: SlideAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pagerAdapter = SlideAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(Fragment1())
        pagerAdapter!!.addFragments(Fragment2())
        pagerAdapter!!.addFragments(Fragment3())
        pagerAdapter!!.addFragments(Fragment4())
        pagerAdapter!!.addFragments(Fragment5())
        pagerAdapter!!.addFragments(Fragment6())

        val pager = findViewById<View>(R.id.vp_main) as ViewPager

        pager.adapter = pagerAdapter
    }
}