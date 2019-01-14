package com.anubhav87.mvvmtutorial.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.anubhav87.mvvmtutorial.NoteRepository
import com.anubhav87.mvvmtutorial.db.entity.Note


class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private var repository: NoteRepository =
        NoteRepository(application)

    private var allNotes: LiveData<List<Note>> = repository.getAllNotes()

    fun insert(note: Note) {
        repository.insert(note)
    }

    fun deleteAllNotes() {
        repository.deleteAllNotes()
    }

    fun getAllNotes(): LiveData<List<Note>> {
        return allNotes
    }
}