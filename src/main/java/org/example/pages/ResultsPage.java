package org.example.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;

public class ResultsPage extends GeneralPageObject {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    private WebElementFacade inkaPalace;

    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    private WebElementFacade selectRoomButton;

    @AndroidFindBy(id = "com.booking:id/rooms_item_select_layout")
    private WebElementFacade selectButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.Button")
    private WebElementFacade reserveButton;


//Reserva ahora

    public void selectInka() {
        inkaPalace.waitUntilVisible().click();
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
