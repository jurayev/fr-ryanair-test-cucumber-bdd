package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

/***
 * This class describes Flights Booking Page
 * PageFactory is used for Page Object
 * It adds lazy evaluation
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
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
        ExplicitWait.elementToBeClickable(ticketPriceButton);
        ticketPriceButton.click();
    }

    public void clickStandardFareRadio(){
        LogUtils.logInfo("Choose 'Standard' fare");
        ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
        standardFareRadio.click();
    }

    public void clickContinueButton(){
        LogUtils.logInfo("Click 'Continue' button");
        ExplicitWait.elementToBeClickable(continueButton);
        continueButton.click();
    }
}
