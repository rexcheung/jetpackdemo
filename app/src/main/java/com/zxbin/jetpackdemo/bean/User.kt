package com.zxbin.jetpackdemo.bean

import androidx.lifecycle.ViewModel
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users", ignoredColumns = arrayOf("mBagOfTags", "mCleared"))
class User : ViewModel() {
    @PrimaryKey(autoGenerate = true)
    public var id: Long? = null;

    @ColumnInfo()
    public var username: String? = null
}