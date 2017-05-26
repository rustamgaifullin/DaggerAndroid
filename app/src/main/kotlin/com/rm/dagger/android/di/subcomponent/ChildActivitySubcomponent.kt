package com.rm.dagger.android.di.subcomponent

import com.rm.dagger.android.di.module.ChildActivityRelatedModule
import com.rm.dagger.android.ui.ChildActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Subcomponent(modules = arrayOf(ChildActivityRelatedModule::class))
@Singleton
interface ChildActivitySubcomponent : AndroidInjector<ChildActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<ChildActivity>()
}