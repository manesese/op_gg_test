package com.example.op_gg_project.viewModel

import androidx.lifecycle.ViewModel
import com.example.op_gg_project.repositoryModule.repository.MainRepository
import com.example.op_gg_project.repositoryModule.repositoryImpl.MainRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepositoryImpl: MainRepositoryImpl): ViewModel() {
}