package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class UserInfoPage extends GeneralPageObject{

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[1]")
    private WebElementFacade inputName;

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[2]")
    private WebElementFacade lastName;

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[3]")
    private WebElementFacade email;

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[4]")
    private WebElementFacade address;

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[5]")
    private WebElementFacade zipCode;

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[4]")
    private WebElementFacade city;

    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[5]")
    private WebElementFacade country;
    @AndroidFindBy(xpath = "(//android.widget.EditText[1])[6]")
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
        address.waitUntilVisible().sendKeys("Calle 38 # 31-130");
    }

    public void setInputZipCode() {
        zipCode.waitUntilVisible().sendKeys("930731660");
    }

    public void setInputCity() {
        city.waitUntilVisible().sendKeys("Bogota");
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
