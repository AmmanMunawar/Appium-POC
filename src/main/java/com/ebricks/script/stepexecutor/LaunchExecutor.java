package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.service.AppiumService;
import com.ebricks.script.stepexecutor.response.StepResponse;

public class LaunchExecutor extends StepExecutor {
    public LaunchExecutor(Step step) {
        super(step);
    }
    public void init() {
        AppiumService.getInstance().getScreenShotAs(this.step.getId());
    }


    public StepResponse execute(UIElement uiElement) {
        init();
        AppiumService.getInstance().launchApp();
        return new StepResponse(this.step);
    }
}
