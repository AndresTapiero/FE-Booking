package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ResultsPage extends GeneralPageObject {

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    private WebElementFacade selectSecondOption;

    @AndroidFindBy(id = "com.booking:id/bui_banner_close_button")
    private WebElementFacade closeBannerButton;

    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    private WebElementFacade selectRoomButton;

    @AndroidFindBy(id = "com.booking:id/rooms_item_select_layout")
    private WebElementFacade selectButton;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button")
    private WebElementFacade reserveButton;


    public void closeBanner() {
        if (closeBannerButton.isPresent()) {
            closeBannerButton.click();
        }
    }

    public void selectSecondOption() {
        selectSecondOption.waitUntilVisible().click();
    }

    public void selectRoom() {
        selectRoomButton.waitUntilVisible().click();
    }

    public void select() {
        selectButton.waitUntilVisible().click();
    }

    public void selectReserveButton() {
        reserveButton.waitUntilVisible().click();
    }
}
