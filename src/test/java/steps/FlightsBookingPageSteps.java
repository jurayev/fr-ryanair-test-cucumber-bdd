package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingPage;

/***
 * This class contains Flights Booking steps
 */
public class FlightsBookingPageSteps {

    private FlightsBookingPage flightsBookingPage;

    public FlightsBookingPageSteps(){
        flightsBookingPage = new FlightsBookingPage();
    }

    @When("^I choose a flight$")
    public void iChooseFlight() {
       flightsBookingPage.clickTicketPriceButton();
    }

    @When("^I choose fare package 'Standard Fare'$")
    public void iChooseStandardFare() {
        flightsBookingPage.clickStandardFareRadio();

    }

    @When("^I proceed by clicking Continue$")
    public void iProceedByClickingContinue() {
        flightsBookingPage.clickContinueButton();
    }

    @When("^I book available flight$")
    public void iBookFlight() {
        iChooseFlight();
        iChooseStandardFare();
        iProceedByClickingContinue();
    }
}
