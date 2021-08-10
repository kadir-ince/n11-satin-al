package com.n11.gauge.constants;

import org.openqa.selenium.By;

public class PaymentConstant {
    public static final By CARD_NUMBER_1 = By.xpath("//div[@class=\"creditCardField\"]//input[2]");
    public static final By CARD_NUMBER_2 = By.xpath("//div[@class=\"creditCardField\"]//input[3]");
    public static final By CARD_NUMBER_3 = By.xpath("//div[@class=\"creditCardField\"]//input[4]");
    public static final By CARD_NUMBER_4 = By.xpath("//div[@class=\"creditCardField\"]//input[5]");

    public static final By CARD_OWNER_NAME = By.xpath("//input[@id=\"cardOwnerName\"]");

    public static final By EXPIRE_MONTH = By.xpath("//select[@id=\"expireMonth\"]");
    public static final By SELECT_EXPIRE_MONTH = By.xpath("//select[@id=\"expireMonth\"]//option[2]");
    public static final By EXPIRE_YEAR = By.xpath("//select[@id=\"expireYear\"]");
    public static final By SELECT_EXPIRE_YEAR = By.xpath("//select[@id=\"expireYear\"]//option[11]");

    public static final By CVC = By.xpath("//input[@id=\"securityCode\"]");


}
