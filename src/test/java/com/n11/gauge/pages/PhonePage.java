package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.constants.AddToCartConstants.*;

public class PhonePage {
    @Step("Add to cart")
    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        click(ADD_TO_CART);
        Thread.sleep(1000);
    }

    @Step("Go to cart")
    public void goToCart() {
        click(GO_TO_CART);
    }
}
