package com.n11.gauge.constants;

import org.openqa.selenium.By;

public class CartConstants {
    public static final By DELETE_PRODUCT = By.xpath("//div[@class=\"prodAction\"]//span[@title=\"Sil\"]");
    public static final By ADD_QUANTITY = By.xpath("//div[@class=\"spinnerFieldContainer\"]//span[@class=\"spinnerUp spinnerArrow\"]");
    public static final By GO_TO_PAYMENT = By.xpath("//span[@id=\"js-goToPaymentBtn\"]");
}
