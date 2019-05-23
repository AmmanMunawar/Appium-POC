package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class UnlockExecutor extends StepExecutor {
    public UnlockExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
