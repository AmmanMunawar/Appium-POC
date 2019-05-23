package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class HomeButtonExecutor extends StepExecutor {
    public HomeButtonExecutor(Step step) {
        super(step);
    }
    public void execute(){
        step.getEvent().execute();
    }
}
