package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;

public class StepFactory {

    private static StepFactory instance;

    public static StepFactory getInstance() {
        if (instance == null) {
            instance = new StepFactory();
        }
        return instance;
    }

    public StepExecutor getStepExecutor(Step step) {

        if (step.getEvent().getType().equals("tap")) {
            return new TapExecutor(step);
        } else if (step.getEvent().getType().equals("back")) {
            return new BackExecutor(step);
        }
        return null;
    }
}
