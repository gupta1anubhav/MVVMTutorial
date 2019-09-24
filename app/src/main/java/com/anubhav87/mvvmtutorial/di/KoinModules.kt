package com.anubhav87.mvvmtutorial.di

import com.anubhav87.mvvmtutorial.adapter.NoteAdapter
import com.anubhav87.mvvmtutorial.db.NoteDatabase
import com.anubhav87.mvvmtutorial.repository.NoteRepository
import com.anubhav87.mvvmtutorial.viewmodel.NoteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dbModule = module {
    single { NoteDatabase.getInstance(
        context = get()
    )}
    factory { get<NoteDatabase>().noteDao() }
}

val repositoryModule = module {
    single { NoteRepository(get()) }
}

val uiModule = module {
    factory { NoteAdapter() }
    viewModel { NoteViewModel(get()) }
}

