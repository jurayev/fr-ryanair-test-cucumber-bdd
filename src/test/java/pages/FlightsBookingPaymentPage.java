package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.ExplicitWait;
import utils.LogUtils;
import utils.ScrollUtils;
import java.util.List;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

/***
 * This class describes Flights Booking Payment Page
 * PageFactory is used for Page Object
 * It adds lazy evaluation
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
public class FlightsBookingPaymentPage extends BasePage{

    public static final String PAYMENT_ERROR_TITLE_MESSAGE = "Oh. There was a problem";

    @FindBy(xpath = "//ng-form[@name='passengerForm0']//select")
    private WebElement adultTitleDropdown;

    @FindBys(@FindBy(xpath = "//ng-form[@name='passengerForm0']//select//option"))
    private List<WebElement> adultTitleList;

    @FindBy(css = "ng-form[name='passengerForm0'] div.payment-passenger-first-name input")
    private WebElement adultName;

    @FindBy(css = "ng-form[name='passengerForm0'] div.payment-passenger-last-name input")
    private WebElement adultLastName;

    @FindBy(xpath = "//ng-form[@name='passengerForm1']//select")
    private WebElement secondAdultTitleDropdown;

    @FindBys(@FindBy(xpath = "//ng-form[@name='passengerForm1']//select//option"))
    private List<WebElement> secondAdultTitleList;

    @FindBy(css = "ng-form[name='passengerForm1'] div.payment-passenger-first-name input")
    private WebElement secondAdultName;

    @FindBy(css = "ng-form[name='passengerForm1'] div.payment-passenger-last-name input")
    private WebElement secondAdultLastName;

    @FindBy(css = "ng-form[name='passengerForm2'] div.payment-passenger-first-name input")
    private WebElement thirdPassengerName;

    @FindBy(css = "ng-form[name='passengerForm2'] div.payment-passenger-last-name input")
    private WebElement thirdPassengerLastName;

    @FindBy(name = "phoneNumberCountry")
    private WebElement phoneNumberCountryDropDown;

    @FindBys(@FindBy(xpath = "//select[@name='phoneNumberCountry']//optgroup//option"))
    private List<WebElement> phoneNumberCountryDropDownList;

    @FindBy(css = "div.phone-number>input")
    private WebElement phoneNumber;

    @FindBy(name = "cardNumber")
    private WebElement cardNumber;

    @FindBy(name = "cardType")
    private WebElement cardTypeDropdown;

    @FindBys(@FindBy(xpath = "//select[@name='cardType']//option"))
    private List<WebElement> cardTypeDropDownList;

    @FindBy(name = "expiryMonth")
    private WebElement expiryMonthDropdown;

    @FindBys(@FindBy(xpath = "//select[@name='expiryMonth']//option"))
    private List<WebElement> expiryMonthDropDownList;

    @FindBy(name = "expiryYear")
    private WebElement expiryYearDropdown;

    @FindBys(@FindBy(xpath = "//select[@name='expiryYear']//option"))
    private List<WebElement> expiryYearDropDownList;

    @FindBy(name = "securityCode")
    private WebElement securityCode;

    @FindBy(name = "cardHolderName")
    private WebElement cardHolderName;

    @FindBy(id = "billingAddressAddressLine1")
    private WebElement addressLine1;

    @FindBy(id = "billingAddressCity")
    private WebElement city;

    @FindBy(css = "div.terms svg")
    private WebElement acceptTermsCheckbox;

    @FindBy(xpath = "//button[@class='core-btn-primary core-btn-medium']")
    private WebElement payNowButton;

    @FindBy(css = "prompt.error.prompt-text")
    private WebElement paymentError;

    @FindBy(css = "prompt.error.prompt-text div.info-title")
    private WebElement paymentErrorTitleMessage;

    @FindBy(css = "div.spinner-plane")
    private WebElement planeLoadingSpinner;

    /***
     * Method extract title from dropdown list using loop statement
     * once condition is met return from loop using break keyword
     * @param title of passenger
     */
    public void chooseAdultTitle(String title) {
        LogUtils.logInfo("Open 'Title' dropdown");
        ExplicitWait.elementToBeClickable(adultTitleDropdown);
        adultTitleDropdown.click();
        //Unfortunately have no time to investigate a reason of WebDriver search and click fail
        //so i just set WebDriver sleep for 1 sec to make it work
        ExplicitWait.visibilityOfElements(adultTitleList);
        ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
        for(WebElement el : adultTitleList){
            if(el.getText().equalsIgnoreCase(title))
            {
                LogUtils.logInfo(String.format("Choose '%s' title", title));
                ExplicitWait.elementToBeClickable(el);
                el.click();
                break;
            }
        }
    }

    /***
     * Method extracts title from dropdown list using loop statement
     * once condition is met return from loop using break keyword
     * @param title of passenger
     */
    public void chooseSecondAdultTitle(String title) {
        LogUtils.logInfo("Open 'Title' dropdown");
        secondAdultTitleDropdown.click();
        for(WebElement el : secondAdultTitleList){
            if(el.getText().equalsIgnoreCase(title))
            {
                LogUtils.logInfo(String.format("Choose '%s' title", title));
                ExplicitWait.elementToBeClickable(el);
                el.click();
                break;
            }
        }
    }

    public void fillAdultName(String name) {
        LogUtils.logInfo(String.format("Fill 'First name' with '%s'", name));
        adultName.sendKeys(name);
    }

    public void fillAdultLastName(String lastName) {
        LogUtils.logInfo(String.format("Fill 'Surname' with '%s'", lastName));
        adultLastName.sendKeys(lastName);
    }

    public void fillSecondAdultName(String name) {
        LogUtils.logInfo(String.format("Fill 'First name' with '%s'", name));
        secondAdultName.sendKeys(name);
    }

    public void fillSecondAdultLastName(String lastName) {
        LogUtils.logInfo(String.format("Fill 'Surname' with '%s'", lastName));
        secondAdultLastName.sendKeys(lastName);
    }

    public void fillThirdPassengerName(String name) {
        LogUtils.logInfo(String.format("Fill 'First name' with '%s'", name));
        thirdPassengerName.sendKeys(name);
    }

    public void fillThirdPassengerLastName(String lastName) {
        LogUtils.logInfo(String.format("Fill 'Surname' with '%s'", lastName));
        thirdPassengerLastName.sendKeys(lastName);
    }

    /***
     * Method extracts country from dropdown list using loop statement
     * once condition is met return from loop using break keyword
     * Use JavascriptExecutor to scroll down page
     * @param country of phone number
     */
    public void selectCountry(String country) {
        LogUtils.logInfo("Scroll down page");
        ScrollUtils.scrollDown(800);
        LogUtils.logInfo("Open phone number 'Country' dropdown");
        phoneNumberCountryDropDown.click();
        for(WebElement el : phoneNumberCountryDropDownList){
            if(el.getText().equalsIgnoreCase(country))
            {
                LogUtils.logInfo(String.format("Choose '%s' phone number country", country));
                el.click();
                break;
            }
        }
    }

    public void fillPhoneNumber(String phoneNumber) {
        LogUtils.logInfo(String.format("Fill 'Phone number' with '%s'", phoneNumber));
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void fillCardNumber(String cardNumber) {
        LogUtils.logInfo(String.format("Fill 'Card number' with '%s'", cardNumber));
        this.cardNumber.sendKeys(cardNumber);
    }

    /***
     * Method extract card type from dropdown list using loop statement
     * once condition is met return from loop using break keyword
     * @param cardType of card holder
     */
    public void chooseCardType(String cardType) {
        LogUtils.logInfo("Open 'Card type' dropdown");
        cardTypeDropdown.click();
        ExplicitWait.visibilityOfElements(cardTypeDropDownList);
        for(WebElement el : cardTypeDropDownList){
            if(el.getText().equalsIgnoreCase(cardType))
            {
                LogUtils.logInfo(String.format("Choose '%s' card type", cardType));
                el.click();
                break;
            }
        }
    }

    /***
     * Method extracts card expiry month from dropdown list using loop statement
     * once condition is met return from loop using break keyword
     * @param month of card expiry date
     */
    public void chooseExpiryMonth(String month) {
        LogUtils.logInfo("Open 'Expiry Month' dropdown");
        expiryMonthDropdown.click();
        for(WebElement el : expiryMonthDropDownList){
            if(el.getText().equalsIgnoreCase(month))
            {
                LogUtils.logInfo(String.format("Choose '%s' month", month));
                el.click();
                break;
            }
        }
    }

    /***
     * Method extracts card expiry month from dropdown list using loop statement
     * once condition is met return from loop using break keyword
     * @param year of card expiry date
     */
    public void chooseExpiryYear(String year) {
        LogUtils.logInfo("Open 'Expiry Year' dropdown");
        expiryYearDropdown.click();
        for(WebElement el : expiryYearDropDownList){
            if(el.getText().equalsIgnoreCase(year))
            {
                LogUtils.logInfo(String.format("Choose '%s' year", year));
                el.click();
                break;
            }
        }
    }

    public void fillSecurityCode(String code) {
        LogUtils.logInfo(String.format("Fill 'Security code' with '%s'", code));
        securityCode.sendKeys(code);
    }

    public void fillCardHolderName(String holderName) {
        LogUtils.logInfo(String.format("Fill 'Card Holder Name' with '%s'", holderName));
        cardHolderName.sendKeys(holderName);
    }

    public void fillAddress(String address) {
        LogUtils.logInfo(String.format("Fill 'Address Line 1' with '%s'", address));
        addressLine1.sendKeys(address);
    }

    public void fillCity(String city) {
        LogUtils.logInfo(String.format("Fill 'City' with '%s'", city));
        this.city.sendKeys(city);
    }

    /***
     * Use JavascriptExecutor to scroll down page
     */
    public void acceptTerms() {
        LogUtils.logInfo("Scroll down page");
        ScrollUtils.scrollDown(1500);
        LogUtils.logInfo("Accept General terms");
        acceptTermsCheckbox.click();
    }

    public void clickPayNowButton() {
        LogUtils.logInfo("Click 'Pay Now' button");
        payNowButton.click();
    }

    public WebElement getPaymentError() {
        return paymentError;
    }

    public String getPaymentErrorTitleMessage() {
        return paymentErrorTitleMessage.getText();
    }

    public WebElement getPlaneLoadingSpinner() {
        return planeLoadingSpinner;
    }
}
