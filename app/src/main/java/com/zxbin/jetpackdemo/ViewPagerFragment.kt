package com.zxbin.jetpackdemo

import android.graphics.ColorSpace
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_viewpager_home.*

class ViewPagerFragment : Fragment() {

    private val TAG = javaClass.simpleName
    private var adapter: SuperFragmentPagerAdapter? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i(TAG, "onCreateView")

        return inflater.inflate(R.layout.fragment_viewpager_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated")

        if (adapter == null) {
            adapter = SuperFragmentPagerAdapter(childFragmentManager)
            adapter?.apply {
                setFragments(
                    VpFragment1(),
                    VpFragment2()
                )
            }
        }


        vp.adapter = adapter

//        adapter.notifyDataSetChanged()

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestory")
    }
}