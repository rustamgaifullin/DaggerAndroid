package com.rm.dagger.android

import android.support.test.filters.SmallTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.rm.dagger.android.special.SpecialMessage
import com.rm.dagger.android.ui.MainActivity
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@SmallTest
class MainActivityInstrumentedTest {

    @JvmField
    @Rule
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun `check special message`() {
        Assert.assertEquals(mActivityTestRule.activity.specialMessage, SpecialMessage("Special for Main Activity"))
    }

}