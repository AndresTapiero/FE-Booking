package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

import static org.example.utilities.Constants.ALERT_ERROR;

public class SearchPage extends GeneralPageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Notificaciones']")
    private WebElementFacade notifications;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    private WebElementFacade inputDestine;

    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    private WebElementFacade inputWriteDestine;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElementFacade firstOption;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    private WebElementFacade searchButton;

    @AndroidFindBy(id = "com.booking:id/facet_date_picker_confirm")
    private WebElementFacade selectDateButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='14 febrero 2024']")
    private WebElementFacade day1;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='28 febrero 2024']")
    private WebElementFacade day2;

    @AndroidFindBy(id = "com.booking:id/message")
    private WebElementFacade alertError;

    @AndroidFindBy(id = "com.booking:id/button_positive")
    private WebElementFacade okButton;


    public void validateScreen() {
        notifications.isDisplayed();
    }

    public void clickInputDestine() {
        inputDestine.waitUntilVisible().click();
    }
    public void setDestinationPlace(String place) {
        inputWriteDestine.sendKeys(place);
    }

    public void selectFirstOption() {
        firstOption.waitUntilVisible().waitUntilClickable().click();
    }

    public void day() {
        day1.waitUntilVisible().click();
        day2.waitUntilVisible().click();
    }

    public void setSelectDateButton() {
        selectDateButton.waitUntilVisible().click();
    }

    public void clickSearch() {
        searchButton.waitUntilVisible().waitUntilClickable().click();
    }

    public void alertError() {
        Assert.assertEquals(ALERT_ERROR.getValue(), alertError.waitUntilVisible().getText());
        okButton.waitUntilVisible().click();
    }

}
