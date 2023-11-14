package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.example.steps.SearchSteps;

import java.io.IOException;

public class SearchDefinition {


    @Steps
    SearchSteps searchSteps;

    @Dado("que estoy en el Search de Booking")
    public void que_estoy_en_el_search_de_booking() {
        searchSteps.setData();
    }


    @Cuando("ingrese los datos y busque")
    public void fillForm() {
        System.out.println("test");
    }

    @Entonces("podre ver los resultados de alojamiento")
    public void validateScreen() {
        System.out.println("test 2 ");
    }

}
