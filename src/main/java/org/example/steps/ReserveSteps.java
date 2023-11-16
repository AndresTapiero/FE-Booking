package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.ReservePage;
import org.fluentlenium.core.annotation.Page;

public class ReserveSteps {

    @Page
    ReservePage reservePage;

    @Step
    public void selectMenuReserve() {
        reservePage.clickReserveMenuButton();
    }

    @Step
    public void validateReserveScreen() {
        reservePage.validateScreen();
    }

    @Step
    public void selectLoginButton() {
        reservePage.selectLoginButton();
    }
}
