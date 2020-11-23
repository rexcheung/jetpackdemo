package com.zxbin.jetpackdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_return_result.*

class ReturnResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_return_result)
        btn_return.setOnClickListener {
            val intent = Intent().apply {
                putExtra("result", 987654321)
            }

            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

}