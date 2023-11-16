package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.ReserveSummaryPage;
import org.fluentlenium.core.annotation.Page;

public class ReserveSummarySteps {

    @Page
    ReserveSummaryPage reserveSummaryPage;

    @Step
    public void validateReserve() {
        reserveSummaryPage.validateReserve();
    }

    @Step
    public void pressLastStep() {
        reserveSummaryPage.selectLastStep();
    }

    @Step
    public String getPrice() {
        return reserveSummaryPage.getPrice();
    }
}
