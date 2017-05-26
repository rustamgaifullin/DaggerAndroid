package com.rm.dagger.android.di

import com.rm.dagger.android.App
import com.rm.dagger.android.di.module.ChildActivityModule
import com.rm.dagger.android.di.module.MainActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule


@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        MainActivityModule::class,
        ChildActivityModule::class)
)
interface AppComponent {
    fun inject(app: App)
}