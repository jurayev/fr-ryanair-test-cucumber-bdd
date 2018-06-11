package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingSeatsSelectionPage;

/***
 * This class contains Seats Selection steps
 */
public class FlightsBookingSeatsSelectionPageSteps {

    private FlightsBookingSeatsSelectionPage flightsBookingSeatsSelectionPage;

    public FlightsBookingSeatsSelectionPageSteps(){
        flightsBookingSeatsSelectionPage = new FlightsBookingSeatsSelectionPage();
    }


    @When("^I select seats for (\\d+) passengers$")
    public void iSelectSeatsForPassengers(int numberOfSeats) {
        flightsBookingSeatsSelectionPage.clickSelectSeatsConfirmButton();
        flightsBookingSeatsSelectionPage.selectSeats(numberOfSeats);
        flightsBookingSeatsSelectionPage.clickReviewSeatsButton();
        flightsBookingSeatsSelectionPage.clickConfirmButton();
        flightsBookingSeatsSelectionPage.declineBagsPriority();
    }
}
