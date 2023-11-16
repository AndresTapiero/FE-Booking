package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.SearchPage;
import org.fluentlenium.core.annotation.Page;

import static org.example.utilities.Constants.CUSCO;
import static org.example.utilities.Constants.FINISH_DATE;

public class SearchSteps {

    @Page
    SearchPage searchPage;


    @Step
    public void validatePage() {
        searchPage.validateScreen();
    }

    @Step
    public void setDestine() {
        searchPage.clickInputDestine();
        searchPage.setDestinationPlace(CUSCO.getValue());
        searchPage.selectFirstOption();
    }

    @Step
    public void selectDays() {
        searchPage.scrollToElement(FINISH_DATE.getValue());
        searchPage.day();
        searchPage.setSelectDateButton();
    }

    @Step
    public void clickSearch() {
        searchPage.clickSearch();
    }

    @Step
    public void validateAlertError() {
        searchPage.alertError();
    }
}
