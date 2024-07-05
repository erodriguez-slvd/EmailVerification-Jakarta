package com.solvd.carina.demo.emailVerification.desktop;

import com.solvd.carina.demo.emailVerification.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @FindBy(id = "ea2t")
    private ExtendedWebElement emailInputBox;

    @FindBy(id = "send_test_btn")
    private ExtendedWebElement sendBtn;

    @FindBy(css = ".success")
    private ExtendedWebElement successfullySentText;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void inputEmail(String email) {
        emailInputBox.type(email);
    }

    @Override
    public void clickOnSendBtn() {
        sendBtn.click();
    }

    @Override
    public boolean isSuccessfullySent() {
        LOGGER.info("** " + successfullySentText.getText() + " **");
        return successfullySentText.isElementPresent();
    }

    @Override
    public String getSentEmailID() {
        return successfullySentText.getText().replace("Success - A test message has been sent!\n" + "Email ID: ", "");
    }
}
