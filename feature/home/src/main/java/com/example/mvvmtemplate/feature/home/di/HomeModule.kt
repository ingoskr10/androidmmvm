package com.example.mvvmtemplate.feature.home.di

import androidx.lifecycle.ViewModel
import com.example.mvvmtemplate.feature.home.HomeViewModel
import dagger.Binds
import dagger.Module

@Module
abstract class HomeModule {
    @Binds
    abstract fun bindViewModel(viewModel: HomeViewModel): ViewModel
}