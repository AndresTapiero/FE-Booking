package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;
import org.example.steps.*;
import org.fluentlenium.core.annotation.Page;

public class ReserveDefinition {

    @Page
    AuthSteps authSteps;
    @Steps
    ReserveSteps reserveSteps;

    @Dado("Que estoy en la pagina reservas")
    public void navigateToReserve() {
        authSteps.pressCloseButton();
        reserveSteps.selectMenuReserve();
    }

    @Cuando("valide la pantalla de reservas y presione iniciar sesión")
    public void pressLogin() {
        reserveSteps.validateReserveScreen();
        reserveSteps.selectLoginButton();
    }

    @Entonces("Entonces veré la pantalla de Iniciar sesión")
    public void validateAuthPageLogin() {
        authSteps.validAuthPage();
    }

}
