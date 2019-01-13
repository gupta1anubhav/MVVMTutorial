package com.anubhav87.mvvmtutorial.db.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.anubhav87.mvvmtutorial.db.entity.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Query("DELETE FROM notes_table")
    fun deleteAllNotes()

    @Query("SELECT * FROM notes_table ")
    fun getAllNotes(): LiveData<List<Note>>

}