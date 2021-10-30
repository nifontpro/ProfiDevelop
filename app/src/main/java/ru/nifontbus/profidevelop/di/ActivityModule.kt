package ru.nifontbus.profidevelop.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.nifontbus.profidevelop.view.main.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
