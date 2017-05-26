package com.rm.dagger.android.di.module

import android.app.Activity
import com.rm.dagger.android.di.subcomponent.ChildActivitySubcomponent
import com.rm.dagger.android.ui.ChildActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap


@Module(subcomponents = arrayOf(ChildActivitySubcomponent::class))
abstract class ChildActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(ChildActivity::class)
    abstract fun bindChildActivityInjectorFactory(builder: ChildActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}