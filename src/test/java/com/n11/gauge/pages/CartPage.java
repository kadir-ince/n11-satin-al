package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.click;
import static com.n11.gauge.constants.CartConstants.*;

public class CartPage {
    @Step("Delete random product from cart")
    public void deleteProduct() throws InterruptedException {
        click(DELETE_PRODUCT);
        Thread.sleep(2000);
    }

    @Step("Add one product quantity")
    public void addQuantity() {
        click(ADD_QUANTITY);
    }

    @Step("Go to payment")
    public void payment() {
        click(GO_TO_PAYMENT);

    }
}
