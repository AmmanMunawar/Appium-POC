package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class BackExecutor extends StepExecutor {

    public BackExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
