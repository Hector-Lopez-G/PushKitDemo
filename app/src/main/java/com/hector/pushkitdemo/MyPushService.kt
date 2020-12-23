package com.hector.pushkitdemo

import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.huawei.hms.push.HmsMessageService

class MyPushService: HmsMessageService() {
    private val TAG = "PushDemoLog"
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.i(TAG, "receive token:$token")
        Toast.makeText(this, token, Toast.LENGTH_LONG).show()
    }
}