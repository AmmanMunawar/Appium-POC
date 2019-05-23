package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class LockExecutor extends StepExecutor {
    public LockExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
