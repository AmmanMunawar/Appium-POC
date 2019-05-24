package com.ebricks.script.stepexecutor;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;

import com.ebricks.script.model.event.SwipeEvent;
import com.ebricks.script.service.AppiumService;

public class SwipeExecutor extends StepExecutor {
    public SwipeExecutor(Step step) {
        super(step);
    }

    public void execute(UIElement uiElement) {
        SwipeEvent swipe = (SwipeEvent) step.getEvent();
        AppiumService.getInstance().swipe(swipe.getStartPointX(), swipe.getStartPointY(), swipe.getEndPointX(), swipe.getEndPointY());

    }
}
