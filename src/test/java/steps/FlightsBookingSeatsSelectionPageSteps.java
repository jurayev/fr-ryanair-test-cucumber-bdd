package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.FlightsBookingSeatsSelectionPage;

public class FlightsBookingSeatsSelectionPageSteps {

    private FlightsBookingSeatsSelectionPage flightsBookingSeatsSelectionPage;

    public FlightsBookingSeatsSelectionPageSteps(){
        flightsBookingSeatsSelectionPage = new FlightsBookingSeatsSelectionPage();
    }

    @And("^I select seats for (\\d+) passengers$")
    public void iSelectSeatsForPassengers(int numberOfSeats) {
        flightsBookingSeatsSelectionPage.clickSelectSeatsConfirmButton();
        flightsBookingSeatsSelectionPage.selectSeats(numberOfSeats);
        flightsBookingSeatsSelectionPage.clickReviewSeatsButton();
        flightsBookingSeatsSelectionPage.clickConfirmButton();
        flightsBookingSeatsSelectionPage.declineBagsPriority();
    }
}
