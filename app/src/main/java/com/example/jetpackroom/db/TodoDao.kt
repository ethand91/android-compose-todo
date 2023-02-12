package com.example.jetpackroom.db

import androidx.room.*

@Dao
interface TodoDao {
    @Query("select * from todos order by created_at asc")
    fun getAll(): MutableList<Todo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun post(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}