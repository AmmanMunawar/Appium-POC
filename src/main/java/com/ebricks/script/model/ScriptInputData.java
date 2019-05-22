package com.ebricks.script.model;

import java.util.ArrayList;
import java.util.List;

public class ScriptInputData {
    private List<Step> steps = new ArrayList<Step>();

    public List<Step> getStepList() {
        return steps;
    }

    public void setStepList(List<Step> stepList) {
        this.steps = stepList;
    }
}
