package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.GeneralPageObject;
import org.example.pages.ResultsPage;
import org.fluentlenium.core.annotation.Page;

public class ResultSteps extends GeneralPageObject {

    @Page
    ResultsPage resultsPage;


    @Step
    public void closeBanner() {
        resultsPage.closeBanner();
    }
    @Step
    public void selectOption() {
        resultsPage.selectSecondOption();
    }
    @Step
    public void selectRoom() {
        resultsPage.selectRoom();
        resultsPage.select();
    }

    @Step
    public void selectReserveRoom() {
        resultsPage.selectReserveButton();
    }

}
