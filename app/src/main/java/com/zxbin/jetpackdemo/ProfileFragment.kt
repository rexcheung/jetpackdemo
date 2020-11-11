package com.zxbin.jetpackdemo

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.navigation.fragment.findNavController
import com.zxbin.jetpackdemo.bean.LoginViewModel
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    private var loginViewModel: LoginViewModel? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
//        loginViewModel = activityViewModels<LoginViewModel>().value
        loginViewModel?.userLive?.observe(viewLifecycleOwner, Observer {
            if (TextUtils.isEmpty(it)) {
                tv_hello.text = "- -"
            } else {
                tv_hello.text = "Hello $it"
            }
        })

        btn_login.setOnClickListener {
//            findNavController().navigate(R.id.action_profile_to_login)

            val action = ProfileFragmentDirections.actionProfileToLogin(123)
            findNavController().navigate(action)
        }

    }

}
