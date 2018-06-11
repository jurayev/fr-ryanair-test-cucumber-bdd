package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

/***
 * This class describes Flights Search Page
 * PageFactory is used for Page Object
 * It adds lazy evaluation
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
public class FlightsSearchPage extends BasePage {

    @FindBy(css = "input#flight-search-type-option-one-way")
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
    private WebElement addChildPassengerButton;

    @FindBy(css = "label.flights")
    private WebElement flights;

    public void clickOneWayTrip(){
        LogUtils.logInfo("Click 'One Way' trip");
        oneWayTrip.click();
    }

    public void fillDepartureAirport(String fromAirport){
        LogUtils.logInfo(String.format("Fill departure airport '%s'", fromAirport));
        departureAirport.clear();
        departureAirport.sendKeys(fromAirport);
    }

    public void fillDestinationAirport(String toAirport){
        LogUtils.logInfo(String.format("Fill destination airport '%s'", toAirport));
        destinationAirport.clear();
        destinationAirport.sendKeys(toAirport);
    }

    public void clickContinueButton(){
        LogUtils.logInfo("Click 'Continue' button");
        ExplicitWait.elementToBeClickable(continueButton);
        continueButton.click();
    }

    public void fillFlyOutDay(String dd){
        LogUtils.logInfo(String.format("Fill fly out day '%s'", dd));
        flyOutDay.sendKeys(dd);
    }

    public void fillFlyOutMonth(String mm){
        LogUtils.logInfo(String.format("Fill fly out month '%s'", mm));
        flyOutDay.sendKeys(mm);
    }
    public void fillFlyOutYear(String yyyy){
        LogUtils.logInfo(String.format("Fill fly out month '%s'", yyyy));
        flyOutDay.sendKeys(yyyy);
    }

    public void openPassengersDropDown() {
        LogUtils.logInfo("Open 'Passengers' dropdown");
        ExplicitWait.elementToBeClickable(passengersDropDown);
        passengersDropDown.click();
    }

    public void closePassengersDropDown() {
        LogUtils.logInfo("Close 'Passengers' dropdown");
        passengersDropDown.click();
    }

    public void addAdultPassenger(){
        LogUtils.logInfo("Add adult passenger");
        ExplicitWait.visibilityOfElement(addAdultPassengerButton);
        addAdultPassengerButton.click();

    }

    public void addChildPassenger(){
        LogUtils.logInfo("Add child passenger");
        ExplicitWait.visibilityOfElement(addChildPassengerButton);
        addChildPassengerButton.click();
    }

    public void clickLetsGoButton(){
        LogUtils.logInfo("Click 'Let's go' button");
        letsGoButton.click();
    }
}
