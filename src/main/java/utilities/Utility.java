package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class Utility {

    public static WebDriver driver;

    public String randomString() {
        String str = RandomStringUtils.randomAlphabetic(6);
        return str;
    }

    public String randomeNumber() {
        String num = RandomStringUtils.randomNumeric(10);
        return num;
    }

    public String randomMbNumber(){
        String num = RandomStringUtils.randomNumeric(8);
        return num;
    }

    public String randomAlphaNumeric() {
        String str = RandomStringUtils.randomAlphabetic(4);
        String num = RandomStringUtils.randomNumeric(4);
        return (str+num);
    }

    public void SwitchWindow() {
        String currentwindow=driver.getWindowHandle();
        Set<String> windowhandles=driver.getWindowHandles();
        windowhandles.size();

        for(String childwindow:windowhandles) {
            if(childwindow.contentEquals(currentwindow)) {
                driver.switchTo().window(childwindow);
                break;
            }
        }
    }



    public String captureScreenshot(String tname) {
        //tname is method name(testName) for which screenshot to be captured

		/*SimpleDateFormat df = new SimpleDateFormat("yyyymmddhhss");
		Date dt= new Date();
		String timeStamp =df.format(dt);*/
        //Above Code is converted into single line code
        String timeStamp = new SimpleDateFormat("yyyymmddhhss").format(new Date());

        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
        //screenshot captured and stored somewhere, So need to copy into destination folder
        String destination = ".\\screenshots\\"+tname+"_"+timeStamp+".png";
        //String destination = "screenshots/" + System.currentTimeMillis() + ".png";

        try {
            FileUtils.copyFile(source, new File(destination));
        } catch(Exception e) {
            e.getMessage();
        }
        return destination;

    }

}