package TestCases;

import Pages.FlightsPage;
import Pages.HomePage;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05_RoundTripFlightSearch extends BaseClass {

    @Test
    public void testRoundTrip() {
        try {
            //Creating object to Homepage
            HomePage hp = new HomePage(driver);

            hp.clickRoundTrip(); //Click on RoundTrip Button

            hp.enterOrigin(); //Enter Origin

            hp.enterDestination(); //Enter destination

            hp.clickDepartureDate(); //Click on departure date and select the date
            Thread.sleep(1000);

            hp.clickReturnDate();

            hp.selectReturnDate();

            hp.clickSearchFlight(); //Click on SearchFlight

            //Thread.sleep(2000);

            //Creating object to BookingPage
            FlightsPage fp = new FlightsPage(driver);

            fp.verifyModifySearch(); //Verify the Modify Search element


        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}