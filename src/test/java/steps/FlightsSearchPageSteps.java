package steps;

import cucumber.api.java.en.When;
import pages.FlightsSearchPage;

/***
 * This class contains FlightsSearchPage steps
 */
public class FlightsSearchPageSteps {

    private FlightsSearchPage page;

    public FlightsSearchPageSteps(){
        page = new FlightsSearchPage();
    }

    @When("^I choose flight type One Way$")
    public void iChooseFlightTypeOneWay() {
        page.clickOneWayTrip();
    }

    @When("^I enter Departure airport '([^\"]*)' and Destination airport '([^\"]*)'$")
    public void iEnterAirportDetails(String fromAirport, String toAirport) {
        page.fillDepartureAirport(fromAirport);
        page.fillDestinationAirport(toAirport);
        page.clickContinueButton();
    }

    @When("^I enter fly out date on '([^\"]*)/([^\"]*)/([^\"]*)'$")
    public void iEnterFlyOutDate(String dd, String mm, String yyyy) {
        page.fillFlyOutDay(dd);
        page.fillFlyOutMonth(mm);
        page.fillFlyOutYear(yyyy);
    }

    @When("^I add adult passenger$")
    public void iAddAdultPassenger(){
        page.openPassengersDropDown();
        page.addAdultPassenger();
        page.closePassengersDropDown();
    }

    @When("^I add child passenger$")
    public void iAddChildPassenger(){
        page.openPassengersDropDown();
        page.addChildPassenger();
        page.closePassengersDropDown();
    }

    @When("^I proceed by clicking ‘Let’s go’$")
    public void iProceedByClickingLetsGo() {
        page.clickLetsGoButton();
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
