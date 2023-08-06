package com.example.photosautomator

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject2
import androidx.test.uiautomator.Until

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        var device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
        device.pressHome()

        device.findObject(By.text("Photos")).clickAndWait(Until.newWindow(), 3000)
        device.findObject(By.text("Photos")).clickAndWait(Until.newWindow(), 3000)
        device.findObject(By.text("Photos")).clickAndWait(Until.newWindow(), 3000)


    }
}