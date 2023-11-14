package org.example.steps;

import net.serenitybdd.annotations.Step;
import org.example.pages.SearchPage;
import org.fluentlenium.core.annotation.Page;

public class SearchSteps {


    @Page
    SearchPage searchPage;


    @Step
    public void setData() {
        //searchPage.closeButtonGuest();
        searchPage.clickInputDestine();
        searchPage.setDestinationPlace("CUSCO");
        searchPage.selectFirstOption();
        searchPage.clickSearch();
    }
}
