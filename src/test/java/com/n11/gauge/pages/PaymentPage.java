package com.n11.gauge.pages;

import com.thoughtworks.gauge.Step;
import static com.n11.gauge.base.BaseMethods.*;
import static com.n11.gauge.constants.PaymentConstant.*;

public class PaymentPage {

    @Step("Fill payment inputs")
    public void fillPaymentInputs() {
        sendKeys(CARD_NUMBER_1, "5282");
        sendKeys(CARD_NUMBER_2, "1111");
        sendKeys(CARD_NUMBER_3, "1111");
        sendKeys(CARD_NUMBER_4, "1111");

        sendKeys(CARD_OWNER_NAME, "Kadir Ince");

        click(EXPIRE_MONTH);
        click(SELECT_EXPIRE_MONTH);
        click(EXPIRE_YEAR);
        click(SELECT_EXPIRE_YEAR);

        sendKeys(CVC, "111");
    }
}