package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.SearchPage;
import org.fluentlenium.core.annotation.Page;

import static org.example.utilities.Constants.CUSCO;
import static org.example.utilities.Constants.INITIAL_DATE;

public class SearchSteps {

    @Page
    SearchPage searchPage;


    @Step
    public void setData() {
        searchPage.clickInputDestine();
        searchPage.setDestinationPlace(CUSCO.getValue());
        searchPage.selectFirstOption();
    }

    @Step
    public void selectDays() {
        searchPage.scrollToElement(INITIAL_DATE.getValue());
        searchPage.day();
        searchPage.setSelectDateButton();
    }

    @Step
    public void clickSearch() {
        searchPage.clickSearch();
    }
}
