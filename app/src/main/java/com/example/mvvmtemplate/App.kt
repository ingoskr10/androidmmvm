package com.example.mvvmtemplate

import android.app.Application
import com.example.mvvmtemplate.di.AppComponent
import com.example.mvvmtemplate.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent
        private set
    
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        appComponent.inject(this)
    }
}