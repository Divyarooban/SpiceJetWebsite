package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03_InvalidLoginAttempts extends BaseClass {

    @Test(priority=1)
    public void testWithInvalidUsername() {

        try {
            HomePage hp = new HomePage(driver);
            hp.clickLogin();
            Thread.sleep(1500);

            LoginPage lp = new LoginPage(driver);

            //Click on email button
            lp.clickEmailButton();

            //Enter Valid email ID
            lp.enterEmail(rb.getString("invalidemail"));

            //Enter Valid Password
            lp.enterPassword(rb.getString("validpassword"));

            //Click on Login Button
            lp.clickLogin();



            Thread.sleep(3000);
            //Verify email error message

            lp.verifyEmailErrorMessage();


        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test(priority=2)
    public void testWithInvalidPassword() {
        try {
            HomePage hp = new HomePage(driver);
            hp.clickLogin();
            Thread.sleep(1500);

            LoginPage lp = new LoginPage(driver);

            //Click on email button
            lp.clickEmailButton();

            //Enter Valid email ID
            lp.enterEmail(rb.getString("validemail"));

            //Enter Valid Password
            lp.enterPassword(rb.getString("invalidpassword"));

            //Click on Login Button
            lp.clickLogin();
            Thread.sleep(2000);
            lp.verifyEmailErrorMessage();


        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test(priority=3)
    public void testWithEmptyCredentials() {
        try {
            HomePage hp = new HomePage(driver);
            hp.clickLogin();
            Thread.sleep(1500);

            LoginPage lp = new LoginPage(driver);

            //Click on email button
            lp.clickEmailButton();

            //Enter Valid email ID
            lp.enterEmail("");
            lp.clickLogin();

            //Verify the error messages
            lp.verifyValidEmailErrorMessage();
            lp.enterEmail(rb.getString("validemail"));

            //Enter Valid Password
            lp.enterPassword("");

            //Click on Login Button
            lp.clickLogin();

            //Verify the error messages
            lp.verifyValidpasswordErrormessage();

            //lp.verifyPasswordErrorMessage();
            Thread.sleep(2000);

        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test(priority=4)
    public void testInvalidMobileNumber() {
        try {
            HomePage hp = new HomePage(driver);
            hp.clickLogin();
            Thread.sleep(1500);

            LoginPage lp = new LoginPage(driver);

            //Click on mobile button
            lp.clickMobileButton();

            //Enter Valid mobile number
            lp.enterMobileNumber(rb.getString("invalidmobile"));

            //Enter Valid Password
            lp.enterPassword(rb.getString("validpassword"));

            //Click on Login Button
            lp.clickLogin();

            //verify the error message
            lp.verifyMobileErrorMessage();
            Thread.sleep(2000);

        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }


}