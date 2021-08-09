package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.base.BaseMethods.sendKeys;
import static com.n11.gauge.base.BaseTest.Setup;
import static com.n11.gauge.base.BaseTest.driver;
import static com.n11.gauge.constants.AddToCartConstants.CLOSE_POPUP;
import static com.n11.gauge.constants.HomePageConstants.*;

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

    @Step("Click random product on home page")
    public void clickRandomProduct() throws InterruptedException {
//        click(RANDOM_PRODUCT);
        driver.navigate().to("https://www.n11.com/urun/xiaomi-mi-box-s-4k-android-tv-medya-oynatici-857648?magaza=vesmark");
        Thread.sleep(2000);
        click(CLOSE_POPUP);
        Thread.sleep(1000);
    }

    @Step("Fill search box with <iphone>")
    public void searchPhone(String phone) throws InterruptedException {
        Thread.sleep(1000);
        sendKeys(SEARCH_BOX, phone);
        click(SEARCH_BUTTON);
    }


}
