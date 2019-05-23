package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class InputTextExecutor extends StepExecutor {
    public InputTextExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
