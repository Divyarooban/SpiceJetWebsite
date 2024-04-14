package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class PaymentsPage extends BasePage{

    public PaymentsPage(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

    //Verify the page
    @FindBy(xpath="//div[text()='Credit/Debit Card']")
    WebElement creditdebitcard;
    public void verifyPaymentsPage() {
        assertTrue(creditdebitcard.isDisplayed());
    }

    //Enter card number
    @FindBy(id="card_number")
    WebElement cardnumber;
    public void enterCardNumber(String str) {
        WebElement frame1 = driver.findElement(By.xpath("(//iframe)[1]"));
        driver.switchTo().frame(frame1);
        cardnumber.sendKeys(str);
        driver.switchTo().defaultContent();
    }

    //Enter card name
    @FindBy(id="name_on_card")
    WebElement nameoncard;
    public void enterNameOnCard(String str) {
        WebElement frame2 = driver.findElement(By.xpath("(//iframe)[2]"));
        driver.switchTo().frame(frame2);
        nameoncard.sendKeys(str);
        driver.switchTo().defaultContent();
    }

    //Enter card expiry month
    @FindBy(id="card_exp_month")
    WebElement cardexpirymonth;
    public void enterCardExpiryMonth(String str) {
        WebElement frame3 = driver.findElement(By.xpath("(//iframe)[3]"));
        driver.switchTo().frame(frame3);
        cardexpirymonth.sendKeys(str);
        driver.switchTo().defaultContent();
    }

    //Enter card expiry year
    @FindBy(id="card_exp_year")
    WebElement cardexpiryyear;
    public void enterCardExpiryYear(String str) {
        WebElement frame4 = driver.findElement(By.xpath("(//iframe)[4]"));
        driver.switchTo().frame(frame4);
        cardexpiryyear.sendKeys(str);
        driver.switchTo().defaultContent();
    }

    //Enter card CVV
    @FindBy(id="security_code")
    WebElement cardCVV;
    public void enterCardCVV(String str) {
        WebElement frame5 = driver.findElement(By.xpath("(//iframe)[5]"));
        driver.switchTo().frame(frame5);
        cardCVV.sendKeys(str);
        driver.switchTo().defaultContent();
    }

    //Click on payment TnC Checkbox
    @FindBy(xpath="//div[@data-testid='add-ons-continue-footer-button'][3]//div[1]")
    WebElement paymentTnC;
    public void clickPaymentTnC() {
        paymentTnC.click();
    }

    //Click on Proceed to pay
    @FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
    WebElement proceedtopay;
    public void clickProceedToPay() {
        proceedtopay.click();
    }

    //Verify payment Failure
    @FindBy(xpath="//div[text()='Payment Failure']")
    WebElement paymentfailure;
    public void verifyPaymentFailure() {
        wait.until(ExpectedConditions.visibilityOf(paymentfailure));
        assertTrue(paymentfailure.isDisplayed());
    }
}