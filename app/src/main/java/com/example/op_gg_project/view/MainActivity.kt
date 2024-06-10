package com.example.op_gg_project.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.example.op_gg_project.databinding.ActivityMainBinding
import com.example.op_gg_project.util.Context
import com.example.op_gg_project.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Timber 라이브러리 세팅
        Timber.plant(Timber.DebugTree())
        Context.appContext = this@MainActivity
    }
}