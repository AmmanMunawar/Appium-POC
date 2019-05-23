package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class HomeExecutor extends StepExecutor {
    public HomeExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
