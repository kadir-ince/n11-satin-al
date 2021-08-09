package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.constants.AddToCartConstants.ADD_TO_CART;
import static com.n11.gauge.constants.AddToCartConstants.GO_TO_CART;

public class PhonePage {
    @Step("Add to cart")
    public void addToCart() throws InterruptedException {
        click(ADD_TO_CART);
        Thread.sleep(1000);
    }

    @Step("Go to cart")
    public void goToCart() {
        click(GO_TO_CART);
    }
}
