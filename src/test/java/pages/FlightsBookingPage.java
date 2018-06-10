package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

public class FlightsBookingPage extends BasePage {

    public static final String URL = "/booking/home";

    public WebElement getActiveFare() {
        return activeFare;
    }

    @FindBy(css = "div.slide.active")
    private WebElement activeFare;

    @FindBy(css = "div.hide-mobile span.flights-table-price__price")
    private WebElement ticketPriceButton;

    @FindBy(css = "div.standard div.flights-table-fares__fare-price")
    private WebElement standardFareRadio;

    @FindBy(css = "div.footer-message button.core-btn-link")
    private WebElement declineSeatsReservationLink;

    @FindBy(css = "button#continue")
    private WebElement continueButton;

    public void clickTicketPriceButton(){
        LogUtils.logInfo("Click ticket 'Price' button");
        ticketPriceButton.click();
    }

    public void clickStandardFareRadio(){
        LogUtils.logInfo("Choose 'Standard' fare");
        standardFareRadio.click();
    }

    public void clickContinueButton(){
        LogUtils.logInfo("Click 'Continue' button");
        ExplicitWait.explicitWaitUntilElementToBeClickable(continueButton);
        continueButton.click();
    }

    public void declineSeatsReservation(){
        LogUtils.logInfo("Decline seats reservation");
        declineSeatsReservationLink.click();
    }
}
