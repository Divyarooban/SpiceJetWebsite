package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.ResourceBundle;

import static org.testng.Assert.assertEquals;

public class BaseClass {
    public static WebDriver driver;
    public ResourceBundle rb;

    @BeforeMethod
    @Parameters("browser")
    public void launchBrowser(@Optional("chrome")String br) {

        rb = ResourceBundle.getBundle("data");

        if(br.equals("chrome")) {
            //System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(br.equals("edge")) {
            driver = new EdgeDriver();
        }
        else if(br.equals("firefox")){
            driver = new FirefoxDriver();
        }

        driver.get(rb.getString("url"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        try {
            assertEquals(driver.getTitle(),"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");

        }catch(Exception e) {
            System.out.println("The Error occured is: "+e.getMessage());
        }
    }

    @AfterMethod
    @Parameters("browser")
    public void closeBrowser() {
        driver.quit();
    }

}