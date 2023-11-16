package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import static org.example.utilities.Constants.TITLE_AUTH_PAGE;

public class AuthPage extends GeneralPageObject {

    @AndroidFindBy(id = "com.booking:id/identity_header_title")
    private WebElementFacade titleAuth;

    @AndroidFindBy(id = "com.booking:id/identity_landing_divider_text")
    private WebElementFacade authDivide;

    @AndroidFindBy(id = "com.booking:id/identity_terms_conditions")
    private WebElementFacade terms;

    @AndroidFindBy(xpath = "//*[@content-desc='Desplazarse hacia arriba']")
    private WebElementFacade closeButton;


    public void validatePage() {
        Assert.assertEquals(TITLE_AUTH_PAGE.getValue(),  titleAuth.waitUntilVisible().getText());
        authDivide.isDisplayed();
        terms.isDisplayed();
    }

    public void closeButtonGuest() {
        closeButton.waitUntilVisible().click();
    }
}
