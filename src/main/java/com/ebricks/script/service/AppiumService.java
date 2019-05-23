package com.ebricks.script.service;

import com.ebricks.script.config.Configuration;
import com.ebricks.script.executor.ScriptExecutor;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

public class AppiumService {
    private static final Logger LOGGER = LogManager.getLogger(ScriptExecutor.class.getName());
    private DesiredCapabilities caps = new DesiredCapabilities();
    private Configuration configuration = Configuration.getInstance();
    private AndroidDriver<MobileElement> driver;
    private static AppiumService instance;

    private AppiumService() {
    }

    public static AppiumService getInstance() {
        if (instance == null) {
            instance = new AppiumService();
        }
        return instance;
    }

    public AndroidDriver<MobileElement> getDriver() {
        return driver;
    }

    public void createSession() {

        caps.setCapability("deviceName", configuration.getDeviceName());
        caps.setCapability("platformName", configuration.getPlatformName());
        caps.setCapability("platformVersion", configuration.getPlatformVersion());
        caps.setCapability("automationName", configuration.getAutomationName());
        caps.setCapability("app", System.getProperty("user.dir") + "/resources/com.coupons.ciapp-4.3.apk");
        try {
            driver = new AndroidDriver<MobileElement>(new URL(configuration.getAppiumURL()), caps);
        } catch (MalformedURLException e) {
            LOGGER.error(e);
        }
    }

    public String getPageSourse() {
        return driver.getPageSource();
    }

    public void backbutton() {

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void homebutton() {
        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public void lock() {
        driver.lockDevice();
    }

    public void unlock() {
        driver.unlockDevice();
    }

    public void launch() {
        driver.launchApp();
    }

    public void swipe(int startX, int startY, int endX, int endY) {

        TouchAction swipe = new TouchAction(driver);
        swipe.press(point(startX, startY)).waitAction(waitOptions(ofSeconds(3))).moveTo(point(endX, endY)).release().perform();
    }
}
