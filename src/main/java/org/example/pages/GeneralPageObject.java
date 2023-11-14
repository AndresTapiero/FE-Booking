package org.example.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class GeneralPageObject extends PageObject {
    protected AndroidDriver androidDriver;
    protected AppiumDriver appiumDriver;
    protected static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public GeneralPageObject() {
        androidDriver = getProxiedDriver();
        appiumDriver = getProxiedDriver();
    }

    public void closeApp() {
        androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

}
