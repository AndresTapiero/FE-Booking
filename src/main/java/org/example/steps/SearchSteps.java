package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.GeneralPageObject;
import org.example.pages.SearchPage;
import org.fluentlenium.core.annotation.Page;

import static org.example.utilities.Constants.CUSCO;
import static org.example.utilities.Constants.FINISH_DATE;

public class SearchSteps extends GeneralPageObject {

    @Page
    SearchPage searchPage;


    @Step
    public void validatePage() {
        searchPage.validateScreen();
    }

    @Step
    public void setDestine(String destine) {
        searchPage.clickInputDestine();
        searchPage.setDestinationPlace(destine);
        searchPage.selectFirstOption();
    }

    @Step
    public void selectDays() {
        searchPage.scrollToElement(FINISH_DATE.getValue());
        searchPage.days();
        searchPage.setSelectDateButton();
    }

    @Step
    public void selectAccommodation() {
        searchPage.clickAccommodation();
        searchPage.selectChildren();
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
