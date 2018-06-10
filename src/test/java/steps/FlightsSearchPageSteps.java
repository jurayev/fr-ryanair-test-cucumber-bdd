package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.FactoryDriver;
import org.junit.Assert;
import pages.FlightsSearchPage;
import utils.ExplicitWait;
import utils.PropertyProvider;

/***
 * This class contains FlightsSearchPage steps
 */
public class FlightsSearchPageSteps {

    private FlightsSearchPage flightsSearchPage;

    public FlightsSearchPageSteps(){
        flightsSearchPage = new FlightsSearchPage();
    }

    @When("^User picks flight type One Way$")
    public void pickFlightTypeOneWay() {
        flightsSearchPage.clickOneWayTrip();
    }

    @When("^User enters Departure airport '([^\"]*)' and Destination airport '([^\"]*)'$")
    public void userEntersAirportDetails(String fromAirport, String toAirport) {
        flightsSearchPage.fillDepartureAirport(fromAirport);
        flightsSearchPage.fillDestinationAirport(toAirport);
        flightsSearchPage.clickContinueButton();
    }



    /*@Then("^I see flight out date field$")
    public void iSeeFlightOutDateField() {
        ExplicitWait.explicitWaitVisibilityOfElement(flightsSearchPage.getFlyOutDate());
        Assert.assertTrue(flightsSearchPage.getFlyOutDate().isDisplayed());
    }*/

    @When("^User picks flight type One Way1$")
    public void userPicksFlightTypeOneWay() {
        flightsSearchPage.clickOneWayTrip();
    }

    @When("^User enters fly out date on '([^\"]*)/([^\"]*)/([^\"]*)'$")
    public void userEntersFlyOutDateOn(String dd, String mm, String yyyy) {
        flightsSearchPage.fillFlyOutDay(dd);
        flightsSearchPage.fillFlyOutMonth(mm);
        flightsSearchPage.fillFlyOutYear(yyyy);
    }

    @When("^User enters passengers$")
    public void userEntersPassengersAdult() {
        flightsSearchPage.openPassengersDropDown();
        flightsSearchPage.addAdultPassenger();
        flightsSearchPage.addChildrenPassenger();
    }

    @When("^User proceeds by clicking ‘Let’s go’$")
    public void userProceedsByClickingLetSGo() {
        flightsSearchPage.clickLetsGoButton();
    }


}
