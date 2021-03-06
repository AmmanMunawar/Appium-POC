package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.service.AppiumService;
import com.ebricks.script.stepexecutor.response.StepExecutorResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TapExecutor extends StepExecutor {

    private static final Logger LOGGER = LogManager.getLogger(TapExecutor.class.getName());

    public TapExecutor(Step step) {
        super(step);
    }

    public StepExecutorResponse execute() {

        try {

            AppiumService.getInstance().click(this.step.getElement());
            this.stepExecutorResponse.setUiElement(this.step.getElement());
            this.stepExecutorResponse.getStepStatus().setStatus(true);

        } catch (Exception e) {

            LOGGER.error("Exception", e);
        }
        return this.stepExecutorResponse;
    }
}
