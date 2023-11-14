package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AuthPage extends GeneralPageObject {

    @AndroidFindBy(id = "com.booking:id/identity_header_title")
    private WebElementFacade title;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
    private WebElementFacade closeButton;



    public void setDestinationPlace(String place) {
        title.sendKeys(place);
    }


}
