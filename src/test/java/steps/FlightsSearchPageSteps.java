package steps;

import cucumber.api.java.en.When;

import pages.FlightsSearchPage;


/***
 * This class contains FlightsSearchPage steps
 */
public class FlightsSearchPageSteps {

    private FlightsSearchPage flightsSearchPage;

    public FlightsSearchPageSteps(){
        flightsSearchPage = new FlightsSearchPage();
    }

    @When("^I choose flight type One Way$")
    public void iChooseFlightTypeOneWay() {
        flightsSearchPage.clickOneWayTrip();
    }

    @When("^I enter Departure airport '([^\"]*)' and Destination airport '([^\"]*)'$")
    public void iEnterAirportDetails(String fromAirport, String toAirport) {
        flightsSearchPage.fillDepartureAirport(fromAirport);
        flightsSearchPage.fillDestinationAirport(toAirport);
        flightsSearchPage.clickContinueButton();
    }

    @When("^I enter fly out date on '([^\"]*)/([^\"]*)/([^\"]*)'$")
    public void iEnterFlyOutDate(String dd, String mm, String yyyy) {
        flightsSearchPage.fillFlyOutDay(dd);
        flightsSearchPage.fillFlyOutMonth(mm);
        flightsSearchPage.fillFlyOutYear(yyyy);
    }

    @When("^I add adult passenger$")
    public void iAddAdultPassenger(){
        flightsSearchPage.openPassengersDropDown();
        flightsSearchPage.addAdultPassenger();
        flightsSearchPage.closePassengersDropDown();
    }

    @When("^I add child passenger$")
    public void iAddChildPassenger(){
        flightsSearchPage.openPassengersDropDown();
        flightsSearchPage.addChildPassenger();
        flightsSearchPage.closePassengersDropDown();
    }

    @When("^I proceed by clicking ‘Let’s go’$")
    public void iProceedByClickingLetsGo() {
        flightsSearchPage.clickLetsGoButton();
    }

    @When("^I make a search for booking from '([^\"]*)' to '([^\"]*)' on '([^\"]*)/([^\"]*)/([^\"]*)' for 2 adults and 1 child$")
    public void iMakeFlightSearch(String fromAirport, String toAirport, String dd, String mm, String yyyy) {
        iChooseFlightTypeOneWay();
        iEnterAirportDetails(fromAirport, toAirport);
        iAddAdultPassenger();
        iAddChildPassenger();
        iEnterFlyOutDate(dd, mm, yyyy);
        iProceedByClickingLetsGo();
    }

}
