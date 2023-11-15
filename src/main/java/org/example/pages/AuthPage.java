package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;

public class AuthPage extends GeneralPageObject {

    @AndroidFindBy(xpath = "//*[contains(@text,'Sign in or create an account')]")
    private WebElementFacade titleAuth;

    @AndroidFindBy(xpath = "//*[@content-desc='Desplazarse hacia arriba']")
    private WebElementFacade closeButton;


    public WebElementState validateAuthTitle() {
        return titleAuth;
    }

    public void closeButtonGuest() {
        closeButton.waitUntilVisible().click();
    }
}
