package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class AddonsPage extends BasePage{

        public AddonsPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath="//div[@data-testid='add-ons-continue-footer-button'][3]")
        WebElement continuebutton;

        @FindBy(xpath="//span[@id='skipfrompopup'][1]")
        WebElement popup;

        public void clickContinue() {
            continuebutton.click();
        }

        public void popUpClick(){popup.click();}



    }


