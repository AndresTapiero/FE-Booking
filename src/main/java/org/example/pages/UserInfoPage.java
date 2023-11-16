package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserInfoPage extends GeneralPageObject{

    @AndroidFindBy(xpath = " //android.widget.TextView[contains(@text, 'Nombre *')]//following-sibling::android.widget.EditText")
    private WebElementFacade inputName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Apellido *')]//following-sibling::android.widget.EditText")
    private WebElementFacade lastName;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'E-mail *')]//following-sibling::android.widget.EditText")
    private WebElementFacade email;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Dirección *')]//following-sibling::android.widget.EditText")
    private WebElementFacade address;


    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Código')]//following-sibling::android.widget.EditText")
    private WebElementFacade zipCode;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Ciudad *')]//following-sibling::android.widget.EditText")
    private WebElementFacade city;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'País/región *')]//following-sibling::android.widget.EditText")
    private WebElementFacade country;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Tel')]//following-sibling::android.widget.EditText")
    private WebElementFacade phone;


    @AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.booking:id/business_purpose_leisure']")
    private WebElementFacade radioButtonLeisure;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.booking:id/action_button']")
    private WebElementFacade continueButton;


    public void setInputName() {
        inputName.waitUntilVisible().sendKeys("Jose");
    }

    public void setInputLastName() {
        lastName.waitUntilVisible().sendKeys("Hurtado");
    }
    public void setInputEmail() {
        email.waitUntilVisible().sendKeys("josehurtado@mail.com");
    }

    public void setInputAddress() {
        if (address.isPresent()) address.sendKeys("Calle 38 # 31-130");
    }

    public void setInputZipCode() {
        if (zipCode.isPresent()) zipCode.waitUntilVisible().sendKeys("930731660");
    }

    public void setInputCity() {
        if (city.isPresent()) city.waitUntilVisible().sendKeys("Bogota");
    }

    public void setInputCountry() {
        country.waitUntilVisible().clear();
        country.waitUntilVisible().sendKeys("Colombia");
    }

    public void setInputPhone() {
        phone.waitUntilVisible().sendKeys("930731660");
    }
    public void selectRadioButton() {
        radioButtonLeisure.waitUntilVisible().click();
    }
    public void selectContinueButton() {
        continueButton.waitUntilVisible().click();
    }

}
