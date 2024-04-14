package Pages;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage extends BasePage{

    public FlightsPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    //Modify Search locator
    @FindBy(xpath="(//div[.='Modify Search'])[2]")
    WebElement modifysearch;

    public void verifyModifySearch() {

        wait.until(ExpectedConditions.visibilityOf(modifysearch));
        assertTrue(modifysearch.isDisplayed());
    }

    //Spice Saver Element Locator
    @FindBy(xpath="//div[text()='SpiceSaver']")
    WebElement spicesaver;
    public void clickSpiceSaver() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(spicesaver));
        //.visibilityOf(spicesaver));
        spicesaver.click();
    }

    //Spice Flex Element Locator
    @FindBy(xpath="//div[@data-testid='spiceflex-flight-select-radio-button-1']")
    WebElement spiceflex;
    public void clickSpiceFlexButton() {
        wait.until(ExpectedConditions.elementToBeClickable(spiceflex));
        spiceflex.click();
    }

    //SpiceMax Element Locator
    @FindBy(xpath="//div[text()='SpiceMax']")
    WebElement spicemax;
    public void clickSpiceMax() {
        spicemax.click();
    }

    //Select First Flight from the list
    @FindBy(xpath="(//div[@class='css-1dbjc4n r-y3rmyz'])[1]")
    WebElement firstflight;
    public void clickFirstFlight() {
        firstflight.click();
    }

    //Select SpiceSaver Button from first flight
    @FindBy(xpath="(//div[@data-testid='spicesaver-flight-select-radio-button-0'])[1]")
    WebElement firstflightspicesaverbutton;

    public void clickSpicesaverButton() {
        firstflightspicesaverbutton.click();
    }

    //Continue Element Locator
    @FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
    WebElement continuebutton;
    public void clickContinue() {
        continuebutton.click();
    }

}