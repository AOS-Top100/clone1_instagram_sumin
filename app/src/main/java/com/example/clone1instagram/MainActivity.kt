package com.example.clone1instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import androidx.core.view.get
import com.example.clone1instagram.databinding.ActivityMainBinding
import com.example.clone1instagram.naviAdapter.NaviAdapter

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        configureBottomNavigation()
    }

    private fun configureBottomNavigation() {
        binding.vpAcMainFragPager.adapter = NaviAdapter(supportFragmentManager, 5)

        binding.tlAcMainBottomMenu.setupWithViewPager(binding.vpAcMainFragPager)

        val bottomNaviLayout: View = this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)

        binding.tlAcMainBottomMenu.getTabAt(0)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_home_tab) as RelativeLayout
        binding.tlAcMainBottomMenu.getTabAt(1)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_search_tab) as RelativeLayout
        binding.tlAcMainBottomMenu.getTabAt(2)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_add_tab) as RelativeLayout
        binding.tlAcMainBottomMenu.getTabAt(3)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_reels_tab) as RelativeLayout
        binding.tlAcMainBottomMenu.getTabAt(4)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_user_tab) as RelativeLayout
    }

    override fun onDestroy() {
        // onDestroy 에서 binding class 인스턴스 참조를 정리해주어야 한다.
        mBinding = null
        super.onDestroy()
    }
}