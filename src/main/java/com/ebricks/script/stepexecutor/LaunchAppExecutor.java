package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class LaunchAppExecutor extends StepExecutor {
    public LaunchAppExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
