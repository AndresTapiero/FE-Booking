package org.example.steps;

import org.example.pages.AuthPage;
import org.example.pages.GeneralPageObject;
import org.fluentlenium.core.annotation.Page;

public class AuthSteps extends GeneralPageObject {

    @Page
    AuthPage authPage;

    public void pressCloseButton() {
        authPage.closeButtonGuest();
    }

    public void validAuthPage() {
       authPage.validatePage();
    }

}
