package com.ebricks.script.model.event;

import com.ebricks.script.service.AppiumService;

public class Home extends Event{
    public void execute(){

        AppiumService.getInstance().homebutton();
    }
}
