package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingPage;

/***
 * This class contains Flights Booking steps
 */
public class FlightsBookingPageSteps {

    private FlightsBookingPage page;

    public FlightsBookingPageSteps(){
        page = new FlightsBookingPage();
    }

    @When("^I choose a flight$")
    public void iChooseFlight() {
       page.clickTicketPriceButton();
    }

    @When("^I choose fare package 'Standard Fare'$")
    public void iChooseStandardFare() {
        page.clickStandardFareRadio();

    }

    @When("^I proceed by clicking Continue$")
    public void iProceedByClickingContinue() {
        page.clickContinueButton();
    }

    @When("^I book available flight$")
    public void iBookFlight() {
        iChooseFlight();
        iChooseStandardFare();
        iProceedByClickingContinue();
    }
}
