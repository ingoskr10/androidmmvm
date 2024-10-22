package com.example.mvvmtemplate.core.data.local.dao

import androidx.room.*
import com.example.mvvmtemplate.core.data.local.entity.ItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
  @Query("SELECT * FROM items")
  fun getAllItems(): Flow<List<ItemEntity>>

  @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend fun insertItem(item: ItemEntity)

  @Delete
  suspend fun deleteItem(item: ItemEntity)
}