package org.example.pages;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.Dimension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class GeneralPageObject extends PageObject {
    protected AndroidDriver androidDriver;
    protected AppiumDriver appiumDriver;
    protected TouchAction<?> touchAction;

    protected PerformsTouchActions touchActions;
    protected static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);


    public GeneralPageObject() {
        androidDriver = getProxiedDriver();
        appiumDriver = getProxiedDriver();
        touchAction = new TouchAction<>(androidDriver);
        touchActions = androidDriver;
    }

    public void closeApp() {
        androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public void scrollDown(int amountScroll) {
        Dimension dimensions = androidDriver.manage().window().getSize();
        int startX = dimensions.width / 2;
        int startY = (int) (dimensions.height * 0.6);
        int endY = (int) (dimensions.height * 0.40);

        for (int i = 0; i < amountScroll; i++) {
            touchAction
                    .press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(400)))
                    .moveTo(PointOption.point(startX, endY))
                    .release();
            touchActions.performTouchAction(touchAction);
        }
    }

    public void scrollToElement(String id) {
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        WebElementFacade element = $("//android.view.View[@content-desc='{0}']", id);
        while (!element.isVisible()) {
            scrollDown(1);
        }
        scrollDown(1);
        resetImplicitTimeout();
    }

    public static void waitTime(Integer totalTime) {
        try {
            Thread.sleep(totalTime * 1000);
        } catch (Exception e) {
            LOGGER.error("error in the wait" + e);
        }
    }

    public String getPageSourceStr() {

        return androidDriver.getPageSource();
    }

}
