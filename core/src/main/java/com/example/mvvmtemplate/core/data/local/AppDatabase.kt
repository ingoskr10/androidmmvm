package com.example.mvvmtemplate.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmtemplate.core.data.local.dao.ItemDao
import com.example.mvvmtemplate.core.data.local.entity.ItemEntity

@Database(entities = [ItemEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
  abstract fun itemDao(): ItemDao
}