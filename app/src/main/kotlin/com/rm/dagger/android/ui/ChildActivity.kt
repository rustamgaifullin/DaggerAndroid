package com.rm.dagger.android.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.rm.dagger.android.R
import com.rm.dagger.android.special.SpecialMessage
import dagger.android.AndroidInjection
import javax.inject.Inject


class ChildActivity : AppCompatActivity() {

    @Inject lateinit var specialMessage : SpecialMessage

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
    }
}
