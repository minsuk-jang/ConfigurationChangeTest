package com.example.configurationchangetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


abstract class BaseActivity<T : ViewDataBinding>(private val layoutId: Int) : AppCompatActivity() {
    private var _binding: T? = null
    protected val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, layoutId)
        setContentView(binding.root)
        binding.lifecycleOwner = this

    }
}