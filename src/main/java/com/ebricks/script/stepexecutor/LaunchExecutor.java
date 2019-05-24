package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.service.AppiumService;

public class LaunchExecutor extends StepExecutor {
    public LaunchExecutor(Step step) {
        super(step);
    }

    public void execute(UIElement uiElement) {
        AppiumService.getInstance().launchApp();
    }
}
