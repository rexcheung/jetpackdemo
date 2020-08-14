package com.zxbin.jetpackdemo.bean

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(vararg user: User)

    @Query("SELECT * FROM users")
    fun loadAllUser(): Array<User>
}