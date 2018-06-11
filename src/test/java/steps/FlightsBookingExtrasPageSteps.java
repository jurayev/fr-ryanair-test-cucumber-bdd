package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingExtrasPage;

/***
 * This class contains Booking Extras steps
 */
public class FlightsBookingExtrasPageSteps {

    private FlightsBookingExtrasPage flightsBookingExtrasPage;

    public FlightsBookingExtrasPageSteps(){
        flightsBookingExtrasPage = new FlightsBookingExtrasPage();
    }

    @When("^I checkout my booking$")
    public void iCheckoutMyBooking() {
        flightsBookingExtrasPage.clickCheckOutButton();
    }
}
