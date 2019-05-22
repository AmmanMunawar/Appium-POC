package com.ebricks.script.model;

import java.util.ArrayList;
import java.util.List;

public class ScriptInputData {
    private List<Step> stepList = new ArrayList<Step>();

    public List<Step> getStepList() {
        return stepList;
    }

    public void setStepList(List<Step> stepList) {
        this.stepList = stepList;
    }
}
