package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTitle.setText("수정가능합니까")


        fun onDestroy() {
            var mbinding = null
            super.onDestroy()
        }

    }
}