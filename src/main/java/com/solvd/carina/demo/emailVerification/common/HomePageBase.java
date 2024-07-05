package com.solvd.carina.demo.emailVerification.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void inputEmail(String email);

    public abstract void clickOnSendBtn();

    public abstract boolean isSuccessfullySent();

    public abstract String getSentEmailID();
}
