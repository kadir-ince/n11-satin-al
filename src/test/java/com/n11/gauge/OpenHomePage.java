package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenHomePage {

    public static WebDriver driver;

    @Step("Navigate to <https://n11.com>")
    public void navigateTo(String url) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Step("Check it is open")
    public void isOpen() {
        if (driver.getTitle() != null) {
            System.out.println("----------------");
            System.out.println("|Page is opened|");
            System.out.println("----------------");
        }
    }

    @Step("Click to the login button")
    public void clickLoginButton() {

    }
}
