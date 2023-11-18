package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.example.steps.*;
import org.fluentlenium.core.annotation.Page;

public class BookingDefinition {

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
        authSteps.validAuthPage();
        authSteps.pressCloseButton();
    }

    @Cuando("ingrese los datos de busqueda {string} y complete el flujo de reserva")
    public void fillDatesAndSelectRoom(String destine) {
        searchSteps.validatePage();
        searchSteps.setDestine(destine);
        searchSteps.selectDays();
        searchSteps.selectAccommodation();
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
        userInfoSteps.setInputCity();
        userInfoSteps.setInputCountry();
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
    }

}
