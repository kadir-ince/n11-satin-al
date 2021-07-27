package com.n11.gauge;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;


public class Login {

    By emailField = By.xpath("//*[@id=\"email\"]");
    By passwordField = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("//*[@id=\"loginButton\"]");

    @Step("Fill email input <email>")
    public void fillEmail(String userEmail) {
        OpenHomePage.driver.findElement(emailField).sendKeys(userEmail);
    }

    @Step("Fill password input <password>")
    public void fillPassword(String userPassword) {
        OpenHomePage.driver.findElement(passwordField).sendKeys(userPassword);
    }

    @Step("Click the login button")
    public void clickLoginButton() {
        OpenHomePage.driver.findElement(loginButton).click();

        // Check Login Action
    }
}
