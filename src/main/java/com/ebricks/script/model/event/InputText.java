package com.ebricks.script.model.event;

import com.ebricks.script.model.UIElement;
import com.ebricks.script.service.AppiumService;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class InputText extends Event {
    public void execute(UIElement uiElement) {

        MobileElement mobileElement = AppiumService.getInstance().getDriver().findElement(By.xpath("//" + uiElement.getType() + "[@text='" + uiElement.getText() + "']"));
        mobileElement.sendKeys("ammanmunawar@ebricks-inc.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
