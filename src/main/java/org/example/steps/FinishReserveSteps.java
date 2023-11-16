package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.FinishReservePage;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class FinishReserveSteps {

    @Page
    FinishReservePage finishReservePage;

    @Step
    public void setCardNumber() {
        finishReservePage.setInputCardNumber();
    }

    @Step
    public void setExpiration() {
        finishReservePage.setInputExpiration();
    }

    @Step
    public void comparePrice(String price) {
        Assert.assertEquals(price,  finishReservePage.getPrice());
    }

    @Step
    public void selectReserveButton() {
        finishReservePage.selectReserve();
    }
}
