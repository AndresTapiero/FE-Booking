package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import org.example.steps.AuthSteps;
import org.example.steps.ResultSteps;
import org.example.steps.SearchSteps;
import org.example.steps.UserInfoSteps;
import org.fluentlenium.core.annotation.Page;

public class SearchDefinition {

    SoftAssertions softly = new SoftAssertions();
    @Page
    AuthSteps authSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    ResultSteps resultSteps;

    @Steps
    UserInfoSteps userInfoSteps;

    @Dado("que estoy en el Search de Booking")
    public void navigateToSearchView() {
        //softly.assertThat(authPage.validateAuthTitle().isPresent()).isTrue();
        authSteps.pressCloseButton();
    }


    @Cuando("ingrese los datos y busque")
    public void fillDatesAndSelectRoom() {
        searchSteps.setData();
        searchSteps.selectDays();
        searchSteps.clickSearch();
        resultSteps.closeBanner();
        resultSteps.selectOption();
        resultSteps.selectRoom();
        resultSteps.selectReserveRoom();

        userInfoSteps.setUserName();
        userInfoSteps.setLastName();
        userInfoSteps.setEmail();
        userInfoSteps.setAddress();
        userInfoSteps.setZipCode();
        userInfoSteps.scrollDown(2);
        userInfoSteps.setInputCity();
        userInfoSteps.setInputCountry();
        userInfoSteps.setInputPhone();

        userInfoSteps.selectRadioButton();
        userInfoSteps.selectContinueButton();

        System.out.println("Info View" + resultSteps.getPageSourceStr());
    }

    @Entonces("podre ver los resultados de alojamiento")
    public void validateScreen() {
        System.out.println("test 2 ");
    }

}
