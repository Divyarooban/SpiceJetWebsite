
package TestCases;

import Pages.*;
import baseClass.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_07_FlightBookingWithPayment extends BaseClass {

    @Test
    public void testFlightBooking() {
        try {
            //Creating object to Homepage
            HomePage hp = new HomePage(driver);

            hp.clickOneway(); //Click on OneWay Button

            hp.enterOrigin(); //Enter Origin

            hp.enterDestination(); //Enter destination

            hp.clickDepartureDate(); //Click on departure date
            Thread.sleep(1000);


            hp.clickSearchFlight(); //Click on SearchFlight

            //Thread.sleep(2000);

            //Creating object to BookingPage
            FlightsPage fp = new FlightsPage(driver);

            fp.verifyModifySearch(); //Verify the Modify Search element
            Thread.sleep(2000);

            fp.clickContinue();// click on continue on Flights page



            PassengersPage pp = new PassengersPage(driver);

            Thread.sleep(2000);
            pp.verifyTripSummary(); //Verify the page


            //Enter Contact Details
            pp.enterFirstName(rb.getString("ppfirstname"));

            pp.enterLastname(rb.getString("pplastname"));

            pp.enterMobileNumber(rb.getString("ppcontactnumber"));

            pp.enterEmail(rb.getString("ppemail"));

            pp.enterCityName(rb.getString("ppcity"));

            pp.clickPrimaryPassengerCheckBox();
            Thread.sleep(1000);

            pp.clickContinue();
            Thread.sleep(2000);

            AddonsPage ap =new AddonsPage(driver);

            ap.clickContinue();
            ap.popUpClick();

            Thread.sleep(5000);


            PaymentsPage paypage = new PaymentsPage(driver);

            paypage.verifyPaymentsPage();

            //Enter Card details to do payment
            //In each input, driver focus switched to inside frame & again switched to default
            //Switching frames are accommodated in each method declared in page objects repository
            paypage.enterCardNumber(rb.getString("cardnumber"));

            paypage.enterNameOnCard(rb.getString("cardholdername"));

            paypage.enterCardExpiryMonth(rb.getString("cardexpirymonth"));

            paypage.enterCardExpiryYear(rb.getString("cardexpiryyear"));

            paypage.enterCardCVV(rb.getString("cardCVV"));


           // paypage.clickPaymentTnC();

            paypage.clickProceedToPay();
            Thread.sleep(2000);

            paypage.verifyPaymentFailure();

        }
        catch(Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

}
