package org.example.pages;

import com.google.common.collect.ImmutableList;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

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

    public void scrollDown(int amountScroll) {
        PointerInput  finger = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence swipe = new Sequence(finger, 1);
        for (int i = 0; i < amountScroll; i++) {
            Dimension dimensions = androidDriver.manage().window().getSize();
            int centerX = dimensions.width / 2;
            int startY = (int) (dimensions.height * 0.6);
            int endY = (int) (dimensions.height * 0.30);

            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, (int)startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            System.out.println("Scroll move");
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(500),
                    PointerInput.Origin.viewport(), centerX, (int)endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            System.out.println("Scroll Go Driver");

            //androidDriver.perform(ImmutableList.of(swipe));

        }
    }

    public void scrollToElement(String id) {
        setImplicitTimeout(1, ChronoUnit.SECONDS);
        WebElementFacade element = $("//android.view.View[@content-desc='{0}']", id);
        while (!element.isVisible()) {
            System.out.println("Scroll");
            scrollDown(1);
        }
        scrollDown(1);
        resetImplicitTimeout();
    }

    public String getPageSourceStr() {
        return androidDriver.getPageSource();
    }

}
