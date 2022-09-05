package com.avelycure.keepersample2

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun useAppContext() {
        activityTestRule.launchActivity(null)
        val superSecretClass = SecretClass()
        TestCase.assertEquals("123", superSecretClass.token)
    }
}