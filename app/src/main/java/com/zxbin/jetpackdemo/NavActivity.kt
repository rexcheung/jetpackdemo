package com.zxbin.jetpackdemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.zxbin.jetpackdemo.bean.LoginViewModel

class NavActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_nav)
        DBUtils.init(this)
    }

    override fun onResume() {
        super.onResume()
        val vm = ViewModelProvider(this).get(LoginViewModel::class.java)
        Log.i("", "")
    }
}