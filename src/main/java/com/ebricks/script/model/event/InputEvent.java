package com.ebricks.script.model.event;

import com.ebricks.script.executor.ScriptExecutor;
import com.ebricks.script.model.UIElement;
import com.ebricks.script.service.AppiumService;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class InputEvent extends Event {
    private static final Logger LOGGER = LogManager.getLogger(ScriptExecutor.class.getName());
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
