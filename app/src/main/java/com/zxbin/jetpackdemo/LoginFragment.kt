package com.zxbin.jetpackdemo

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.zxbin.jetpackdemo.bean.LoginViewModel
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    private var loginViewModel: LoginViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
//        loginViewModel = activityViewModels<LoginViewModel>().value

        btn_login.setOnClickListener {
            val username = et_username.text.toString()
            if (TextUtils.isEmpty(username)) {
                Toast.makeText(context, "Pls input username.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Login success", Toast.LENGTH_SHORT).show()
                loginViewModel?.login(et_username.text.toString())
                findNavController().popBackStack()
            }
        }

        val ld = MutableLiveData<String>()



    }
}