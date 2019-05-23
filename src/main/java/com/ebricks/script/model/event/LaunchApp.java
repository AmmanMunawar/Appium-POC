package com.ebricks.script.model.event;

import com.ebricks.script.service.AppiumService;

public class LaunchApp extends Event {
    public void execute() {

        AppiumService.getInstance().launch();
    }
}
