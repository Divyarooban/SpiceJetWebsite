package TestCases;

import Pages.FlightsPage;
import Pages.HomePage;
import baseClass.BaseClass;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class TC_04_OnewayFlightSearch extends BaseClass {



    @Test
    public void onewaySearchFlight() {
        try {

            //Creating object to Homepage
            HomePage hp = new HomePage(driver);

            hp.clickOneway(); //Click on OneWay Button

            hp.enterOrigin(); //Enter Origin

            hp.enterDestination(); //Enter destination
            Thread.sleep(2000);
            hp.clickDepartureDate(); //Click on departure date

            Thread.sleep(1000);

           // hp.selectDate(); //Select the date

            hp.clickSearchFlight(); //Click on SearchFlight

            //Thread.sleep(2000);

            //Creating object to BookingPage
            FlightsPage fp = new FlightsPage(driver);

            fp.verifyModifySearch(); //Verify the Modify Search element

        }
        catch(Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}