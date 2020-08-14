package com.zxbin.jetpackdemo.bean

import android.text.TextUtils
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class LoginViewModel : ViewModel() {

    @PrimaryKey(autoGenerate = true)
    public var id: Long? = -1;
    @ColumnInfo()
    public var username: String? = null

    @Ignore
    public var test: String = ""

    fun isLogined(): Boolean {
        return !TextUtils.isEmpty(username)
    }

    public fun login(username: String) {
        this.username = username
        userLive.value = username
    }

    @Ignore
    val userLive = MutableLiveData<String>()
}