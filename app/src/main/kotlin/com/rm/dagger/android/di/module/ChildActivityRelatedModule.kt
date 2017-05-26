package com.rm.dagger.android.di.module

import com.rm.dagger.android.special.SpecialMessage
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ChildActivityRelatedModule {
    @Provides
    @Singleton
    fun specialMessage() = SpecialMessage("Special for Child Activity")
}