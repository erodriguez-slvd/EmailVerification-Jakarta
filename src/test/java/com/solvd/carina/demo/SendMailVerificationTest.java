package com.solvd.carina.demo;

import com.solvd.carina.demo.emailVerification.common.HomePageBase;
import com.solvd.carina.demo.utils.EmailVerification;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SendMailVerificationTest implements IAbstractTest {
    @Test
    public void successfullySentMailTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not open");
        homePage.inputEmail(R.TESTDATA.get("email"));
        homePage.clickOnSendBtn();
        pause(3);
        Assert.assertTrue(homePage.isSuccessfullySent(), "Email has not been sent successfully");
        String sentEmailID = homePage.getSentEmailID();
        EmailVerification emailVerification = new EmailVerification();
        String receivedEmailID = emailVerification.readEmails(R.EMAIL.get("mail.imap.host"), R.TESTDATA.get("email"), R.TESTDATA.get("password"));
        Assert.assertEquals(sentEmailID, receivedEmailID, "Sent and received email's ID do not match");
    }
}
