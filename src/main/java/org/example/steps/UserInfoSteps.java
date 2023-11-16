package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.GeneralPageObject;
import org.example.pages.UserInfoPage;
import org.fluentlenium.core.annotation.Page;

public class UserInfoSteps extends GeneralPageObject {

    @Page
    UserInfoPage userInfoPage;

    @Step
    public void setUserName() {
        userInfoPage.setInputName();
    }

    @Step
    public void setLastName() {
        userInfoPage.setInputLastName();
    }

    @Step
    public void setEmail() {
        userInfoPage.setInputEmail();
    }

    @Step
    public void setAddress() {
        userInfoPage.setInputAddress();
    }

    @Step
    public void setZipCode() {
        userInfoPage.setInputZipCode();
        userInfoPage.scrollDown(2);
    }

    @Step
    public void setInputCity() {
        userInfoPage.setInputCity();
    }

    @Step
    public void  setInputCountry() {
        userInfoPage.setInputCountry();
    }

    @Step
    public void  setInputPhone() {
        userInfoPage.setInputPhone();
    }

    @Step
    public void selectRadioButton() {
        userInfoPage.selectRadioButton();
    }

    @Step
    public void selectContinueButton() {
        userInfoPage.selectContinueButton();
    }
}
