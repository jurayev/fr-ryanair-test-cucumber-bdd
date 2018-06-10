package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.FlightsBookingPage;
import utils.ExplicitWait;

public class FlightsBookingPageSteps {

    private FlightsBookingPage flightsBookingPage;

    public FlightsBookingPageSteps(){
        flightsBookingPage = new FlightsBookingPage();
    }

    @Then("^User should see available flights$")
    public void userShouldSeeAvailableFlights() {
        ExplicitWait.explicitWaitVisibilityOfElement(flightsBookingPage.getActiveFare());
        Assert.assertTrue(flightsBookingPage.getCurrentUrl().contains(FlightsBookingPage.URL));
    }

    @When("^User clicks on 'Price' ticket$")
    public void userClicksOnPriceTicket() {
       flightsBookingPage.clickTicketPriceButton();
    }

    @And("^User picks fare package 'Standard Fare'$")
    public void userPicksFarePackageStandardFare() {
        flightsBookingPage.clickStandardFareRadio();

    }

    @And("^User proceeds by clicking Continue$")
    public void userProceedsByClickingContinue() {
        flightsBookingPage.clickContinueButton();
    }
}
