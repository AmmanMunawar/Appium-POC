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
        }else if (step.getEvent().getType().equals("lock")) {
            return new LockExecutor(step);
        }else if (step.getEvent().getType().equals("unlock")) {
            return new UnlockExecutor(step);
        }else if (step.getEvent().getType().equals("home")){
            return new HomeButtonExecutor(step);
        }else if (step.getEvent().getType().equals("launch")){
            return new LaunchAppExecutor(step);
        }else if (step.getEvent().getType().equals("inputText")){
            return new InputTextExecutor(step);
        }


        return null;
    }
}
