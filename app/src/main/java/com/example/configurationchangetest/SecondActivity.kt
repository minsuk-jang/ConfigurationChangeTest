package com.example.configurationchangetest

import android.os.Bundle
import android.util.Log
import com.example.configurationchangetest.Constants.TAG
import com.example.configurationchangetest.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity<ActivitySecondBinding>(R.layout.activity_second) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e(TAG, "[Second] onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "[Second] onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "[Second] onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "[Second] onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "[Second] onDestroy")
    }
}