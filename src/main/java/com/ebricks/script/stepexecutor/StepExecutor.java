package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;

public class StepExecutor {
    protected Step step;

    public StepExecutor(Step step) {
        this.step = step;
    }

    public void execute(){
    }
    public void execute(UIElement uiElement){}
}
