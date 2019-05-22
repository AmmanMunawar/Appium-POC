package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;

public class TapExecutor extends StepExecutor {
    public TapExecutor(Step step) {
        super(step);
    }
    public void execute(UIElement uiElement){
        step.getEvent().execute(uiElement);
    }
}
