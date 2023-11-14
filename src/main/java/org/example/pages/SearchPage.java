package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchPage extends GeneralPageObject {

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    private WebElementFacade inputDestine;

    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    private WebElementFacade inputWriteDestine;

    @AndroidFindBy(xpath = "\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElementFacade firstOption;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Desplazarse hacia arriba\"]")
    private WebElementFacade closeButton;

    @AndroidFindBy(xpath = "com.booking:id/facet_search_box_cta")
    private WebElementFacade searchButton;


    public void clickInputDestine() {
        inputDestine.click();
    }
    public void setDestinationPlace(String place) {
        inputWriteDestine.sendKeys(place);
    }

    public void selectFirstOption() {
        firstOption.click();
    }

    public void clickSearch() {
        searchButton.click();
    }

    public void closeButtonGuest() {
        closeButton.click();
    }
}
