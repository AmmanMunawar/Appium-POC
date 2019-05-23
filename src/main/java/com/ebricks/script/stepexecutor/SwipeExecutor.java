package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class SwipeExecutor extends StepExecutor {
    public SwipeExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
