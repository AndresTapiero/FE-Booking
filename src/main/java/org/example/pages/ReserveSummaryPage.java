package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import static org.example.utilities.Constants.ENTER;
import static org.example.utilities.Constants.EXIT;

public class ReserveSummaryPage extends GeneralPageObject{

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'mié., 14 feb. 2024')]")
    private WebElementFacade tvCheckin;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'mié., 28 feb. 2024')]")
    private WebElementFacade tvCheckout;
    @AndroidFindBy(xpath = "(//*[@resource-id='com.booking:id/subtitle'])[1]")
    private WebElementFacade tvNights;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'US$')]")
    private WebElementFacade price;

    @AndroidFindBy(xpath = "(//*[@resource-id='com.booking:id/action_button'])[1]")
    private WebElementFacade lastStepButton;

    SoftAssertions softly = new SoftAssertions();

    public void validateReserve() {
        softly.assertThat(validateTextElement(ENTER.getValue()));
        softly.assertThat(validateTextElement(EXIT.getValue()));
        softly.assertAll();
        tvNights.waitUntilVisible().getText();
        Assert.assertEquals("mié., 14 feb. 2024",  tvCheckin.waitUntilVisible().getText());
        Assert.assertEquals("mié., 28 feb. 2024",  tvCheckout.waitUntilVisible().getText());
    }

    public String getPrice() {
        return price.waitUntilVisible().getText();
    }

    public void selectLastStep() {
        lastStepButton.waitUntilVisible().click();
    }


}
