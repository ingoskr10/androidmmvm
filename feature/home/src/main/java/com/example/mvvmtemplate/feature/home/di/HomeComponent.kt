package com.example.mvvmtemplate.feature.home.di

import com.example.mvvmtemplate.di.AppComponent
import com.example.mvvmtemplate.feature.home.HomeFragment
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
interface HomeComponent {
    fun inject(fragment: HomeFragment)
    
    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): HomeComponent
    }
}