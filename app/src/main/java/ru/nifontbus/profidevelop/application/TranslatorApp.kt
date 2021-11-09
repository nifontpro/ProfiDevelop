package ru.nifontbus.profidevelop.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.nifontbus.profidevelop.di.application
import ru.nifontbus.profidevelop.di.historyScreen
import ru.nifontbus.profidevelop.di.mainScreen

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(application, mainScreen, historyScreen))
        }
    }
}
