package com.example.op_gg_project.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.op_gg_project.databinding.ActivityMainBinding
import com.example.op_gg_project.util.Context
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber


class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Timber 라이브러리 세팅
        Timber.plant(Timber.DebugTree())
        Context.appContext = this@MainActivity

    }
}