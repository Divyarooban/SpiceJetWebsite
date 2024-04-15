package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    //From/ Origin Locator
    @FindBy(xpath="//div[text()='From']")
    WebElement fromCity;

    @FindBy(xpath = "//div[@class='css-1dbjc4n']//div[contains(text(),'Hyderabad')]")
    WebElement selectFromCity;

    public void enterOrigin() {
        fromCity.click();
        selectFromCity.click();
    }

    //Destination Locator
    @FindBy(xpath="(//input[@autocomplete='on'])[2]")
    WebElement destination;

    @FindBy(xpath = "//div[@class='css-1dbjc4n']//div[contains(text(),'Chennai')]")
    WebElement selectToCity;

    public void enterDestination() {
        destination.click();
        selectToCity.click();
    }

    //Departure date locator
    @FindBy(xpath="//div[@data-testid='departure-date-dropdown-label-test-id']")
    WebElement departuredate;

    @FindBy(xpath="//div[@data-testid='undefined-calendar-day-25'][1]")
    WebElement date;

    //Select the departure date
    public void clickDepartureDate() throws InterruptedException {

         Actions act=new Actions(driver);
        act.moveToElement(date).click().build().perform();
    }



    //Signup Locator
    @FindBy(xpath="//div[contains(text(),'Signup')]")
    WebElement signup;

    public void clickSignup() {
        signup.click();
    }

    //Login Locator
    @FindBy(xpath="//div[contains(text(),'Login')]")
    WebElement login;

    public void clickLogin() {
        login.click();
    }

    //Oneway Button
    @FindBy(xpath="//div[contains(text(),'one way')]")
    WebElement onewaybutton;

    public void clickOneway() {
        onewaybutton.click();
    }

    //Round Trip Locator
    @FindBy(xpath="//div[contains(text(),'round trip')]")
    WebElement roundtrip;

    public void clickRoundTrip() {
        roundtrip.click();
    }

    //No.of passengers
    @FindBy(xpath="//div[.='Passengers']")
    WebElement passengers;

    public void clickPassengers() {
        passengers.click();
    }

    //Search Flight button locator
    @FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
    WebElement searchflight;

    public void clickSearchFlight() {
        searchflight.click();
    }

    //Return Date Locator
    @FindBy(xpath="//div[.='Return Date']")
    WebElement returndate;

    public void clickReturnDate() {
        returndate.click();
    }

    //Select Return Date
    @FindBy(xpath="//div[@data-testid='undefined-calendar-day-30'][1]")
    WebElement selectreturndate;

    @FindBy(xpath="//div[contains(text(),'Select Date')]")
    WebElement returndateclick;

    public void selectReturnDate() throws Exception {
        returndateclick.click();
        Thread.sleep(1000);
        selectreturndate.click();
    }

    //Check-In field locator


}
