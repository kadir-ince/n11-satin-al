package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;

import static com.n11.gauge.base.BaseMethods.*;
import static com.n11.gauge.constants.LoginPageConstants.*;

public class LoginPage {
    @Step("Login with <mailim2@mailinator.com> and <test1234>")
    public void login(String email, String password) {
        sendKeys(EMAIL_INPUT, email);
        sendKeys(PASSWORD_INPUT, password);
        click(LOGIN_BUTTON);
    }
}
