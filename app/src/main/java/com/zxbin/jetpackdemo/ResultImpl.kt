package com.zxbin.jetpackdemo

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class ResultImpl : ActivityResultContract<String, Int>() {
    override fun createIntent(context: Context, input: String?): Intent {
        return Intent(context, ReturnResultActivity::class.java)
            .apply { putExtra("arg", "Hello") }
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Int? {
        val data = intent?.getIntExtra("result", -1)
        return if (resultCode == Activity.RESULT_OK && data != null) {
            data
        } else {
            null
        }
    }
}