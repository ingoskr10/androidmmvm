package com.example.mvvmtemplate.core.di

import android.content.Context
import androidx.room.Room
import com.example.mvvmtemplate.core.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
  @Provides
  @Singleton
  fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
    return Room.databaseBuilder(
      context,
      AppDatabase::class.java,
      "app_database"
    ).build()
  }

  @Provides
  fun provideItemDao(database: AppDatabase) = database.itemDao()
}