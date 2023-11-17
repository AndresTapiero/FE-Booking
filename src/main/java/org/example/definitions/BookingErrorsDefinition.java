package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.example.steps.*;

public class BookingErrorsDefinition {

    @Steps
    SearchSteps searchSteps;

    @Cuando("seleccione buscar sin ingresar un destino")
    public void selectSearch() {
        searchSteps.clickSearch();
    }

    @Entonces("podre ver el mensaje de error")
    public void validateEnterDestine() {
        searchSteps.validateAlertError();
    }

}
