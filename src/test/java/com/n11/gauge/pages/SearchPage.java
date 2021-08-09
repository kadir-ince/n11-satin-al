package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.constants.SearchPageConstant.LAST_PHONE;

public class SearchPage {

    @Step("Click last phone")
    public void clickLastPhone() {
        click(LAST_PHONE);
    }
}
