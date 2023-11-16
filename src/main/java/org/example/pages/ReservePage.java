package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ReservePage extends GeneralPageObject {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Reservas']/android.widget.ImageView")
    private WebElementFacade reserveMenuButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Activos']/android.view.ViewGroup/android.widget.TextView")
    private WebElementFacade activeButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Pasados']/android.view.ViewGroup/android.widget.TextView")
    private WebElementFacade pastButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Cancelados']/android.view.ViewGroup/android.widget.TextView")
    private WebElementFacade cancelButton;

    @AndroidFindBy(id = "com.booking:id/signIn")
    private WebElementFacade loginButton;



    public void clickReserveMenuButton() {
        reserveMenuButton.waitUntilVisible().click();
    }


    public void validateScreen() {
        activeButton.isDisplayed();
        pastButton.isDisplayed();
        pastButton.isDisplayed();
    }

    public void selectLoginButton() {
        loginButton.waitUntilVisible().click();
    }

}
