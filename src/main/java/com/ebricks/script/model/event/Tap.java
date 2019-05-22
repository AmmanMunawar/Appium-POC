package com.ebricks.script.model.event;

import com.ebricks.script.model.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Tap extends Event {
    public void execute(Step step,AndroidDriver<MobileElement> driver){

        if(step.getElement()!=null){

            MobileElement mobileElement = driver.findElement(By.xpath("//"+step.getElement().getType()+"[@text='" + step.getElement().getText() + "']"));
            mobileElement.click();
        }
    }
}
