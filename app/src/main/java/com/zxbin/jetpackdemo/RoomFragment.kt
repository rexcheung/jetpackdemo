package com.zxbin.jetpackdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.zxbin.jetpackdemo.bean.LoginViewModel
import com.zxbin.jetpackdemo.bean.User
import kotlinx.android.synthetic.main.fragment_room.*

class RoomFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_room, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_insert.setOnClickListener(this)
        btn_check.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_insert -> insertdata()
            R.id.btn_check -> getAllData()
            else -> {
            }
        }
    }

    private fun getAllData() {
        Thread(Runnable {
            val users = DBUtils.getAppDataBase(requireContext())
                .userDao()
                .loadAllUser()

            Log.i("123", "" + users.size)
        }).start()
    }

    private fun insertdata() {
        Thread(Runnable {
            val db = DBUtils.getAppDataBase(requireContext())
            for (i in 0 until 10) {
                val user = User()
                user.username = "User_$i"
                db.userDao().insertUser(user)

            }
        }).start()
    }
}