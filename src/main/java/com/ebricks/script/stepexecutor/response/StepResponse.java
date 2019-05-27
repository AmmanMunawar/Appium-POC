package com.ebricks.script.stepexecutor.response;

import com.ebricks.script.model.Step;
import com.ebricks.script.model.UIElement;

public class StepResponse {

    private Screen screen = new Screen();
    private StepStatus stepStatus = new StepStatus();
    private UIElement uiElement;
    private Step step;
    public StepResponse(Step step){
        this.step = step;
        this.uiElement = step.getElement();
        this.stepStatus.setStatus(true);
        this.screen.setScreenshotName(String.valueOf(step.getId()));
    }
    public String response(){
        return "{ "+
                "action:"+this.step.getEvent().getType()+","+
                "screenshotname:"+this.screen.getScreenshotName()+","+
                "status:"+this.stepStatus.getStatus()+"}";
    }
}