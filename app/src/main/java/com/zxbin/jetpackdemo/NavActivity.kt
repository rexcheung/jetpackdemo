package com.zxbin.jetpackdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner

class NavActivity : AppCompatActivity(), ViewModelStoreOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_nav)

    }

}