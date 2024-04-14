package Pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateFieldsPage extends BasePage{

    public ValidateFieldsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

    //Check-In field Locator
    @FindBy(xpath="//div[@data-testid='check-in-horizontal-nav-tabs']")
    WebElement checkin;
    public void clickCheckIn() {
        checkin.click();
    }

    //Manage Booking
    @FindBy(xpath="//div[@data-testid='manage booking-horizontal-nav-tabs']")
    WebElement managebooking;
    public void clickManageBooking() {
        managebooking.click();
    }

    //Flight Status field Locator
    @FindBy(xpath="//div[@data-testid='flight status-horizontal-nav-tabs']")
    WebElement flightstatus;
    public void clickFlightStatus() {
        flightstatus.click();
    }

    //Verify Check-in field
    @FindBy(xpath="//div[.='Web Check-In']")
    WebElement webcheckin;
    public void verifyCheckIn() {
        assertTrue(webcheckin.isDisplayed());
    }

    //Verify FightStatus field
    @FindBy(xpath="//div[contains(text(),'Get up-to-date flight status.')]")
    WebElement message;
    public void verifyFightStatus() {
        assertTrue(message.isDisplayed());
    }

    //Verify Manage Booking field
    @FindBy(xpath="//div[.='View / Manage Booking']")
    WebElement viewbooking;
    public void verifyManageBooking() {
        assertTrue(viewbooking.isDisplayed());
    }

}