package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;

/***
 * This class describes FlightsSearchPage
 * PageFactory is used for Page Object
 * It adds lazy initialization
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
public class FlightsSearchPage extends BasePage {

    @FindBy(css = "span#lbl-flight-search-type-one-way")
    private WebElement oneWayTrip;

    @FindBy(css = "div.col-departure-airport input.core-input")
    private WebElement departureAirport;

    @FindBy(css = "div.col-destination-airport input.core-input")
    private WebElement destinationAirport;

    @FindBy(css = "button[ng-click='extendForm($event)']")
    private WebElement continueButton;

    @FindBy(css = "button[ng-click='searchFlights()']")
    private WebElement letsGoButton;

    /***
     * It's not the best way using locator with particular attribute name as it might be changed
     * however there are two date input fields 'Fly in:' and 'Fly out:' on this page
     * which have quite similar attributes
     */
    @FindBy(css = "input[aria-label='Fly out: - DD']")
    private WebElement flyOutDay;

    @FindBy(css = "input[aria-label='Fly out: - MM']")
    private WebElement flyOutMonth;

    @FindBy(css = "input[aria-label='Fly out: - YYYY']")
    private WebElement flyOutYear;

    @FindBy(css = "div.col-passengers svg")
    private WebElement passengersDropDown;

    @FindBy(css = "div[value='paxInput.adults'] button.core-btn.inc")
    private WebElement addAdultPassengerButton;

    @FindBy(css = "div[value='paxInput.children'] button.core-btn.inc")
    private WebElement addChildrenPassengerButton;

    public void clickOneWayTrip(){
        oneWayTrip.click();
    }

    public void fillDepartureAirport(String fromAirport){
        departureAirport.sendKeys(fromAirport);
    }

    public void fillDestinationAirport(String toAirport){
        destinationAirport.sendKeys(toAirport);
    }

    public void clickContinueButton(){
        ExplicitWait.explicitWaitUntilElementToBeClickable(continueButton);
        continueButton.click();
    }

    public void fillFlyOutDay(String dd){
        flyOutDay.sendKeys(dd);
    }
    public void fillFlyOutMonth(String mm){
        flyOutDay.sendKeys(mm);
    }
    public void fillFlyOutYear(String yyyy){
        flyOutDay.sendKeys(yyyy);
    }

    public void openPassengersDropDown() {
        passengersDropDown.click();
    }

    public void addAdultPassenger(){
        ExplicitWait.explicitWaitVisibilityOfElement(addAdultPassengerButton);
        addAdultPassengerButton.click();

    }

    public void addChildrenPassenger(){
        ExplicitWait.explicitWaitVisibilityOfElement(addChildrenPassengerButton);
        addChildrenPassengerButton.click();
    }

    public void clickLetsGoButton(){
        letsGoButton.click();
    }
}
