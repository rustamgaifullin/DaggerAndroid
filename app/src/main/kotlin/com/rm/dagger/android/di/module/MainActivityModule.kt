package com.rm.dagger.android.di.module

import com.rm.dagger.android.di.subcomponent.MainActivitySubcomponent
import com.rm.dagger.android.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import android.app.Activity


@Module(subcomponents = arrayOf(MainActivitySubcomponent::class))
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}