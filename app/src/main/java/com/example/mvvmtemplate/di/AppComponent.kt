package com.example.mvvmtemplate.di

import android.app.Application
import com.example.mvvmtemplate.App
import com.example.mvvmtemplate.core.di.DatabaseModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DatabaseModule::class])
interface AppComponent {
    fun inject(app: App)
    
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}