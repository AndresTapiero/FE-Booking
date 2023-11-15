package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.SearchPage;
import org.fluentlenium.core.annotation.Page;

import static org.example.utilities.Constants.CUSCO;

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
        searchPage.scrollToElement("14 febrero 2024");
        searchPage.day();
        searchPage.setSelectDateButton();
        searchPage.clickSearch();
    }
}
