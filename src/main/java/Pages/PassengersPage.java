package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengersPage extends BasePage{

    public PassengersPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

	/*@FindBy(xpath="")
	WebElement */

    @FindBy(xpath="//div[contains(text(),'Trip Summary')]")
    WebElement tripsummary;
    public void verifyTripSummary() {
        assertTrue(tripsummary.isDisplayed());
    }

    //Enter Firstname - Locator
    @FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
    WebElement firstname;
    public void enterFirstName(String str){
        firstname.sendKeys(str);
    }

    //Enter Lastname - Locator
    @FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
    WebElement lastname;
    public void enterLastname(String str) {
        lastname.sendKeys(str);
    }

    //Enter Phone number
    @FindBy(xpath="//input[@data-testid='contact-number-input-box']")
    WebElement mobilenumber;
    public void enterMobileNumber(String str) {
        mobilenumber.sendKeys(str);
    }

    //Enter email ID
    @FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
    WebElement email;
    public void enterEmail(String str) {
        email.sendKeys(str);
    }

    @FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
    WebElement cityName;
    public void enterCityName(String str) {
        cityName.sendKeys(str);
    }

    @FindBy(xpath="//div[text()='I am flying as the primary passenger']")
    WebElement checkboxprimarypassenger;
    public void clickPrimaryPassengerCheckBox() {
        checkboxprimarypassenger.click();
    }

    @FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
    WebElement continuebutton;
    public void clickContinue() {
        continuebutton.click();
    }


}