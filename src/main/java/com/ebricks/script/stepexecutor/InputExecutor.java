package com.ebricks.script.stepexecutor;

import com.ebricks.script.executor.ScriptExecutor;
import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.model.event.InputEvent;
import com.ebricks.script.service.AppiumService;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class InputExecutor extends StepExecutor {
    private static final Logger LOGGER = LogManager.getLogger(ScriptExecutor.class.getName());

    public InputExecutor(Step step) {
        super(step);
    }

    public void execute(UIElement uiElement) {
        InputEvent input = (InputEvent) step.getEvent();
        AppiumService.getInstance().setValue(uiElement,input.getText());
    }
}
