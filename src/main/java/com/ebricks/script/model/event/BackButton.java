package com.ebricks.script.model.event;

import com.ebricks.script.model.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BackButton extends Event {

    public void execute(Step step,AndroidDriver<MobileElement> driver){

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
