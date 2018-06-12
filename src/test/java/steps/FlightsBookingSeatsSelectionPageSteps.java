package steps;

import cucumber.api.java.en.When;
import pages.FlightsBookingSeatsSelectionPage;

/***
 * This class contains Seats Selection steps
 */
public class FlightsBookingSeatsSelectionPageSteps {

    @When("^I select seats for (\\d+) passengers$")
    public void iSelectSeatsForPassengers(int numberOfSeats) {
        FlightsBookingSeatsSelectionPage page = new FlightsBookingSeatsSelectionPage();
        page.clickSelectSeatsConfirmButton();
        page.selectSeats(numberOfSeats);
        page.clickReviewSeatsButton();
        page.clickConfirmButton();
        page.declineBagsPriority();
    }
}
