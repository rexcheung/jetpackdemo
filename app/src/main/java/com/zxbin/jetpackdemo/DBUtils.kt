package com.zxbin.jetpackdemo

import android.content.Context
import androidx.room.Room

class DBUtils {
    companion object {
        private var db: AppDataBase? = null

        fun init(context: Context) {
            if (db == null) {
                db = db ?: Room.databaseBuilder(context, AppDataBase::class.java, "database_name")
                    .build()
            }
        }

        fun getAppDataBase(context: Context): AppDataBase {
            init(context)
            return db!!
        }
    }
}