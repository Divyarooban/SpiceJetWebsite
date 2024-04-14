package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    //Email button Locator
    @FindBy(xpath="//div[text()='Email']")
    WebElement emailbutton;

    public void clickEmailButton() {
        emailbutton.click();
    }


    //mobile number button Locator
    @FindBy(xpath="//div[text()='Mobile Number']")
    WebElement mobilenumberbutton;

    public void clickMobileButton() {
        mobilenumberbutton.click();
    }

    //Enter email ID Locator
    @FindBy(xpath="//input[@type='email']")
    WebElement email;

    public void enterEmail(String str) {
        email.sendKeys(str);
    }

    //Enter Password Locator
    @FindBy(xpath="//input[@type='password']")
    WebElement password;

    public void enterPassword(String str) {
        password.sendKeys(str);
    }

    //Login Button Locator
    @FindBy(xpath="//div[@data-testid='login-cta']")
    WebElement loginbutton;

    @FindBy(xpath="//div[.='Please enter a valid email address']")
    WebElement validemail;

    public void verifyValidEmailErrorMessage() {

        assertTrue(validemail.isDisplayed());
    }



    public void clickLogin() {
        loginbutton.click();
    }

    //Inalid email id error message
   @FindBy(xpath="//div[@class='css-1dbjc4n r-13awgt0']//div[contains(text(),'Invalid')]")
           //div[@class='css-76zvg2 r-jwli3a r-n6v787 r-majxgm r-1dumxj3']")
    WebElement emailerrormessage;

    public void verifyEmailErrorMessage() {

       assertTrue(emailerrormessage.isDisplayed());
    }

    //Password error message
    @FindBy(xpath="//div[.='Please enter a valid password']")
    WebElement passworderrormessage;

    public void verifyValidpasswordErrormessage(){

        assertTrue(passworderrormessage.isDisplayed());
    }

    public void verifyPasswordErrorMessage() {

        assertTrue(emailerrormessage.isDisplayed());
    }

    //Mobile number field - Locatot
    @FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
    WebElement mobilenumber;

    public void enterMobileNumber(String str) {
        mobilenumber.sendKeys(str);
    }

    //Verify invalid mobile error message
    @FindBy(xpath="//div[.='Please enter a valid mobile number']")
    WebElement mobileerrormessage;

    @FindBy(xpath="//div[@class='css-1dbjc4n r-1jkjb']//div[contains(text(),'Divya')]")
    WebElement username;

    public void verifyUsername(){
        assertEquals(username.getText(),"Hi Divya");
    }

    public void verifyMobileErrorMessage() {
        assertTrue(mobileerrormessage.isDisplayed());
    }
}