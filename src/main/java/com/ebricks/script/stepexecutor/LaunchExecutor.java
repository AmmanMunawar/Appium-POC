package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class LaunchExecutor extends StepExecutor {
    public LaunchExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
