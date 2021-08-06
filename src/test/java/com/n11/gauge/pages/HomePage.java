package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.BaseTest.Setup;
import static com.n11.gauge.base.BaseTest.driver;
import static com.n11.gauge.constants.HomePageConstants.LOGIN_PAGE_LINK;

public class HomePage {
    @Step("Navigate to <https://n11.com>")
    public void goToHomePage(String url) {
        Setup();
        driver.get(url);
    }

    @Step("Go to login page")
    public void goToLoginPage() {
        click(LOGIN_PAGE_LINK);
    }
}
