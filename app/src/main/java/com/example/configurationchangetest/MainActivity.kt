package com.example.configurationchangetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.configurationchangetest.Constants.TAG
import com.example.configurationchangetest.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding.button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        Log.e(TAG, "[Main] onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "[Main] onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "[Main] onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "[Main] onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "[Main] onDestroy")
    }
}