package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import java.util.Objects;
import static org.example.utilities.Constants.*;

public class SearchPage extends GeneralPageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Notificaciones']")
    private WebElementFacade notifications;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_destination")
    private WebElementFacade inputDestine;

    @AndroidFindBy(id = "com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content")
    private WebElementFacade inputWriteDestine;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElementFacade firstOption;

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    private WebElementFacade optAccommodation;

    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/group_config_children_count']//following-sibling::*[@resource-id='com.booking:id/bui_input_stepper_value']")
    private WebElementFacade tvQuantityChildren;

    @AndroidFindBy(xpath = "//*[@resource-id='com.booking:id/group_config_children_count']//following-sibling::*[@resource-id='com.booking:id/bui_input_stepper_add_button']")
    private WebElementFacade addButtonChildren;

    @AndroidFindBy(id = "com.booking:id/age_picker_view")
    private WebElementFacade agePicker;

    @AndroidFindBy(id = "android:id/numberpicker_input")
    private WebElementFacade numberPicker;
    @AndroidFindBy(id = "android:id/button1")
    private WebElementFacade okButtonAlert;

    @AndroidFindBy(id = "com.booking:id/group_config_child_age_row_label")
    private WebElementFacade tvChildAge;

    @AndroidFindBy(id = "com.booking:id/group_config_child_age_row_button")
    private WebElementFacade rwChildAge;

    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    private WebElementFacade applyButton;

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
    private WebElementFacade okErrorAlertButton;


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

    public void days() {
        day1.waitUntilVisible().click();
        day2.waitUntilVisible().click();
    }

    public void setSelectDateButton() {
        selectDateButton.waitUntilVisible().click();
    }

    public void clickAccommodation() {
        optAccommodation.waitUntilVisible().click();
    }

    public void selectChildren() {

        addButtonChildren.waitUntilVisible().click();
        agePicker.waitUntilVisible();
        while (!Objects.equals(numberPicker.getText(), FIVE_YEARS.getValue())) {
            scrollDown(1, 900);
        }
       okButtonAlert.waitUntilVisible().click();
        Assert.assertEquals(BOY.getValue(), tvChildAge.waitUntilVisible().getText());
        Assert.assertEquals(FIVE_YEARS.getValue(), rwChildAge.waitUntilVisible().getText());
        applyButton.waitUntilVisible().click();
    }

    public void clickSearch() {
        searchButton.waitUntilVisible().waitUntilClickable().click();
    }

    public void alertError() {
        Assert.assertEquals(ALERT_ERROR.getValue(), alertError.waitUntilVisible().getText());
        okErrorAlertButton.waitUntilVisible().click();
    }

}
