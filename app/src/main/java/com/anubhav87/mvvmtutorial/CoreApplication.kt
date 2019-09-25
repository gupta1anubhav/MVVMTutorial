package com.anubhav87.mvvmtutorial

import android.app.Application
import com.anubhav87.mvvmtutorial.di.dbModule
import com.anubhav87.mvvmtutorial.di.repositoryModule
import com.anubhav87.mvvmtutorial.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CoreApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CoreApplication)
            modules(listOf(dbModule, repositoryModule,  uiModule))
        }
    }
}