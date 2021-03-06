package com.zxbin.jetpackdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    val launcher = registerForActivityResult(ResultImpl(), object : ActivityResultCallback<Int> {
        override fun onActivityResult(result: Int?) {
            result?.apply {
                Toast.makeText(requireActivity(), "$this", Toast.LENGTH_SHORT).show()
            }
        }
    })


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle = Bundle()
        bundle.putInt("arg_in_fragment", 3)
        btn_profile.setOnClickListener {
            findNavController().navigate(
                R.id.action_mainfragment_to_profilefragment,
                bundle
            )
        }

        btn_room.setOnClickListener { findNavController().navigate(R.id.action_firstfragment_to_room_fragment) }

        btn_vp.setOnClickListener { findNavController().navigate(R.id.action_firstfragment_to_viewpager) }

        btn_result.setOnClickListener {

            launcher.launch("args")
        }

    }
}