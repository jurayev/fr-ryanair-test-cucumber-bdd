package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingExtrasPage;

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
