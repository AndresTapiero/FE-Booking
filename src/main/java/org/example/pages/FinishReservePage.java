package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import static org.example.utilities.Constants.CARD_NUMBER_INVALID;

public class FinishReservePage extends GeneralPageObject{

    @AndroidFindBy(xpath = "//*[contains(@text, 'Número de la tarjeta')]")
    private WebElementFacade inputCardNumber;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Fecha')]")
    private WebElementFacade inputExpiration;
    @AndroidFindBy(xpath = "(//*[@resource-id='com.booking:id/subtitle'])[1]")
    private WebElementFacade tvNights;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'US$')]")
    private WebElementFacade price;

    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/action_button']")
    private WebElementFacade reserveButton;

    @AndroidFindBy(xpath = "//*[contains(@text, 'tarjeta no')]")
    private WebElementFacade errorQuantityCard;


    SoftAssertions softly = new SoftAssertions();

    public void setInputCardNumber() {
       inputCardNumber.waitUntilVisible().sendKeys("4555788765443333");
    }

    public void setInputExpiration() {
         inputExpiration.waitUntilVisible().sendKeys("02/25");
    }

    public String getPrice() {
        return price.waitUntilVisible().getText();
    }



    public void selectReserve() {
        reserveButton.waitUntilVisible().click();
        Assert.assertEquals(CARD_NUMBER_INVALID.getValue(),  errorQuantityCard.waitUntilVisible().getText());
    }


}
