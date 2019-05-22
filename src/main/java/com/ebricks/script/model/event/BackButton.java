package com.ebricks.script.model.event;

import com.ebricks.script.service.AppiumService;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BackButton extends Event {

    public void execute(){

        AppiumService.getInstance().getDriver().pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
