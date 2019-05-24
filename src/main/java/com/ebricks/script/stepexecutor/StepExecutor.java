package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;

public abstract class StepExecutor {
    protected Step step;

    public StepExecutor(Step step) {
        this.step = step;
    }

    public abstract void execute(UIElement uiElement);
}
