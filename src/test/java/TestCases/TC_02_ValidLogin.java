package TestCases;

import Pages.HomePage;
import Pages.LoginPage;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_02_ValidLogin extends BaseClass {

    @Test(priority=1)
    public void testValidEmailLoginCredentials() {

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
            lp.enterPassword(rb.getString("validpassword"));

            //Click on Login Button
            lp.clickLogin();
            Thread.sleep(2000);

            lp.verifyUsername();


        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test(priority=2)
    public void testValidMobileLogin() {
        try {
            HomePage hp = new HomePage(driver);
            hp.clickLogin();
            Thread.sleep(1500);

            LoginPage lp = new LoginPage(driver);

            //Click on mobile button
            lp.clickMobileButton();

            //Enter Valid mobile number
            lp.enterMobileNumber(rb.getString("validmobile"));

            //Enter Valid Password
            lp.enterPassword(rb.getString("validpassword"));

            //Click on Login Button
            lp.clickLogin();
            Thread.sleep(2000);
            lp.verifyUsername();

        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}