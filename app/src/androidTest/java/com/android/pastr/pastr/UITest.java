package com.android.pastr.pastr;


import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class UITest {

    private static final String CALC_PACKAGE = "com.android.pastr.pastr";
    private UiDevice mDevice;

    @Test
    public void uITest() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

        UiObject marker = mDevice.findObject(new UiSelector().descriptionContains("Kálvin square"));
        try {
            marker.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

        UiObject title = mDevice.findObject(new UiSelector().textContains("Kálvin square"));

        try {
            assertEquals("Kálvin square", title.getText());
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

        UiObject vrButton = mDevice.findObject(new UiSelector().index(R.id.vr_mode_button));
        try {
            vrButton.click();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }

        UiObject buttonDesc = mDevice.findObject(new UiSelector().textContains("Place your phone into your Cardboard viewer"));

        try {
            assertEquals("Place your phone into your Cardboard viewer", buttonDesc.getText());
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }
}
