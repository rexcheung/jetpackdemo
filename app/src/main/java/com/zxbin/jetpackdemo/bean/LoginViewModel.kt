package com.zxbin.jetpackdemo.bean

import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private var username: String? = null

    fun isLogined(): Boolean {
        return !TextUtils.isEmpty(username)
    }

    public fun login(username: String) {
        this.username = username
        userLive.value = username
    }

    val userLive = MutableLiveData<String>()
}