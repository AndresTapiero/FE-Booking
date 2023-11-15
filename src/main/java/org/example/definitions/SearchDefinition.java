package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.assertj.core.api.SoftAssertions;
import org.example.pages.AuthPage;
import org.example.pages.ResultsPage;
import org.example.steps.ResultSteps;
import org.example.steps.SearchSteps;
import org.fluentlenium.core.annotation.Page;

import java.io.IOException;

public class SearchDefinition {

    SoftAssertions softly = new SoftAssertions();
    @Page
    AuthPage authPage;

    @Steps
    SearchSteps searchSteps;

    @Steps
    ResultSteps resultSteps;

    @Dado("que estoy en el Search de Booking")
    public void navigateToSearchView() {
        //softly.assertThat(authPage.validateAuthTitle().isPresent()).isTrue();
        authPage.closeButtonGuest();
    }


    @Cuando("ingrese los datos y busque")
    public void fillDatesAndSelectRoom() {
        searchSteps.setData();
        searchSteps.selectDays();
        resultSteps.selectRoom();
        resultSteps.selectReserveRoom();
    }

    @Entonces("podre ver los resultados de alojamiento")
    public void validateScreen() {
        System.out.println("test 2 ");
    }

}
