package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.service.AppiumService;
import com.ebricks.script.stepexecutor.response.StepResponse;

public class HomeExecutor extends StepExecutor {
    public HomeExecutor(Step step) {
        super(step);
    }
    public void init() {
        AppiumService.getInstance().getScreenShotAs(this.step.getId());
    }


    public StepResponse execute(UIElement uiElement) {
        init();
        AppiumService.getInstance().home();
        return new StepResponse(this.step);
    }
}
