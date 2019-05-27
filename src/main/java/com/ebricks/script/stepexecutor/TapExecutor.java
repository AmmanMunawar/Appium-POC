package com.ebricks.script.stepexecutor;

import com.ebricks.script.executor.ScriptExecutor;
import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.service.AppiumService;
import com.ebricks.script.stepexecutor.response.StepResponse;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class TapExecutor extends StepExecutor {

    private static final Logger LOGGER = LogManager.getLogger(ScriptExecutor.class.getName());

    public TapExecutor(Step step) {
        super(step);
    }

    public void init() {
        AppiumService.getInstance().getScreenShotAs(this.step.getId());
    }


    public StepResponse execute(UIElement uiElement) {
        init();
        AppiumService.getInstance().click(uiElement);
        return new StepResponse(this.step);
    }
}
