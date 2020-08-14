package com.zxbin.jetpackdemo

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zxbin.jetpackdemo.bean.User
import com.zxbin.jetpackdemo.bean.UserDao

@Database(entities = [User::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
}