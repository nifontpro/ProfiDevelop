package ru.nifontbus.profidevelop.application

import android.app.Application
import org.koin.core.context.startKoin
import ru.nifontbus.profidevelop.di.application
import ru.nifontbus.profidevelop.di.mainScreen

class TranslatorApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(application, mainScreen))
        }
    }
}
