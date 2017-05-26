package com.rm.dagger.android.di.subcomponent

import com.rm.dagger.android.di.module.MainActivityRelatedModule
import com.rm.dagger.android.ui.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Subcomponent(modules = arrayOf(MainActivityRelatedModule::class))
@Singleton
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}