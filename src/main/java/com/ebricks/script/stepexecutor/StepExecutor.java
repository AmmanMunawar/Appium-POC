package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.stepexecutor.response.StepResponse;

public abstract class StepExecutor {
    protected Step step;

    public StepExecutor(Step step) {
        this.step = step;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public abstract void init();

    public abstract StepResponse execute(UIElement uiElement);
}
