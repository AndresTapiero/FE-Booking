package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import org.example.steps.*;
import org.fluentlenium.core.annotation.Page;

import static org.example.pages.GeneralPageObject.waitTime;

public class BookingDefinition {

    SoftAssertions softly = new SoftAssertions();
    @Page
    AuthSteps authSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    ResultSteps resultSteps;

    @Steps
    UserInfoSteps userInfoSteps;

    @Steps
    ReserveSummarySteps reserveSummarySteps;

    @Steps
    FinishReserveSteps finishReserveSteps;

    private String price;

    @Dado("Que estoy en la pagina principal de Booking")
    public void navigateToSearchView() {
        authSteps.validTitle();
        authSteps.pressCloseButton();
        searchSteps.validatePage();
    }


    @Cuando("ingrese los datos de busqueda seleccionando habitacion")
    public void fillDatesAndSelectRoom() {
        searchSteps.setDestine();
        searchSteps.selectDays();
        searchSteps.clickSearch();
        resultSteps.closeBanner();
        resultSteps.selectOption();
        resultSteps.selectRoom();
        resultSteps.selectReserveRoom();
        userInfoSteps.setUserName();
        userInfoSteps.setLastName();
        userInfoSteps.setEmail();

        //userInfoSteps.setAddress();
        //userInfoSteps.setZipCode();
        //userInfoSteps.scrollDown(2);
        //userInfoSteps.setInputCity();
        //userInfoSteps.setInputCountry();


        userInfoSteps.setInputPhone();

        userInfoSteps.selectRadioButton();
        userInfoSteps.selectContinueButton();

        reserveSummarySteps.validateReserve();
        reserveSummarySteps.pressLastStep();
        price = reserveSummarySteps.getPrice();

        finishReserveSteps.setCardNumber();
        finishReserveSteps.setExpiration();
    }

    @Entonces("podre ver el precio del alojamiento seleccionado")
    public void validateScreen() {
        finishReserveSteps.comparePrice(price);
        finishReserveSteps.selectReserveButton();
        waitTime(2);
        System.out.println("Info View" + resultSteps.getPageSourceStr());
    }

}
