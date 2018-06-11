package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.FlightsBookingPage;
import utils.ExplicitWait;

/***
 * This class contains Flights Booking steps
 */
public class FlightsBookingPageSteps {

    private FlightsBookingPage flightsBookingPage;

    public FlightsBookingPageSteps(){
        flightsBookingPage = new FlightsBookingPage();
    }
//TODO:
   /* @Then("^User should see available flights$")
    public void userShouldSeeAvailableFlights() {
        ExplicitWait.visibilityOfElement(flightsBookingPage.getActiveFare());
        Assert.assertTrue(flightsBookingPage.getCurrentUrl().contains(FlightsBookingPage.URL));
    }*/

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
