package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

public class SignupPage extends BasePage{

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//select[@class='form-control form-select ']")
    WebElement title;

    public void selectTitle(String str) {
        Select ss = new Select(title);
        ss.selectByValue(str);
    }

    //locator for firstname
    @FindBy(id="first_name")
    WebElement firstname;

    public void enterFirstName(String str) {
        firstname.sendKeys(str);
    }

    //Lastname locator
    @FindBy(id="last_name")
    WebElement lastname;

    public void enterLastName(String str) {
        lastname.sendKeys(str);
    }

    //Country Locator
    @FindBy(xpath="(//select)[2]")
    WebElement country;

    public void selectCountry(String str) {
        Select ss = new Select(country);
        ss.selectByValue(str);
    }

    //Date of Birth Locator
    @FindBy(id="dobDate")
    WebElement dob;

    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    WebElement month;

    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    WebElement year;

    @FindBy(xpath = "//div[@aria-label='Choose Tuesday, July 10th, 1990']")
    WebElement day;


    public void enterMonth(String str) {
        dob.click();
        Select s=new Select(month);
        s.selectByValue(str);
    }

    public void enterYear(String yr){
        Select y=new Select(year);
        y.selectByValue(yr);

    }

    public void day(){
        day.click();

    }

    //mobilenumber Locator
    @FindBy(xpath="//input[@type='tel']")
    WebElement mobilenumber;

    public void enterMobileNumber(String str) {
        mobilenumber.sendKeys(str);
    }

    //email id Locator
    @FindBy(id="email_id")
    WebElement emailID;

    public void enterEmailID(String str) {
        emailID.sendKeys(str);
    }

    //Password locator
    @FindBy(id="new-password")
    WebElement newpassword;

    public void enterNewPassword(String str) {
        newpassword.sendKeys(str);
    }

    //Confirm password locator
    @FindBy(id="c-password")
    WebElement confirmpassword;

    public void enterConfirmPassword(String str) {
        confirmpassword.sendKeys(str);
    }

    //Checkbox Locator
    @FindBy(xpath = "//div[@class='form-check']//input")
    WebElement checkbox;

    public void clickCheckbox() {
        Actions actions=new Actions(driver);
        actions.click(checkbox).build().perform();
    }

    //Signin button Locator
    @FindBy(xpath="//button[@type='button']")
    WebElement signinbutton;

    public void clickSignin() {
        signinbutton.click();

    }

    //Signin valid message
    @FindBy(xpath="//button[contains(text(),'Verify')]")
    WebElement verifyOTP;

    public void validateSignin(){
       assertTrue(signinbutton.isDisplayed());
    }


    //Signin error message
    @FindBy(xpath="//div[contains(text(),'Please fill all mandatory fields marked with an '*' to proceed')]")
    WebElement signinerrormessage;

    public void verifyErrorMessage() {
        assertTrue(signinerrormessage.isDisplayed());
    }
}
