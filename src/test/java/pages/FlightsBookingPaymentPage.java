package pages;

import driver.FactoryDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.ExplicitWait;

import java.util.List;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

public class FlightsBookingPaymentPage extends BasePage{

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

    public void chooseAdultTitle(String title) {
        ExplicitWait.explicitWaitUntilElementToBeClickable(adultTitleDropdown);
        adultTitleDropdown.click();
        for(WebElement el : adultTitleList){
            if(el.getText().equalsIgnoreCase(title))
            {
                ExplicitWait.explicitWait(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
                el.click();
                break;
            }
        }
        adultTitleDropdown.click();
    }

    public void chooseSecondAdultTitle(String title) {
        secondAdultTitleDropdown.click();
        for(WebElement el : secondAdultTitleList){
            if(el.getText().equalsIgnoreCase(title))
            {
                el.click();
                break;
            }
        }
    }

    public void fillAdultName(String name) {
        adultName.sendKeys(name);
    }

    public void fillAdultLastName(String lastName) {
        adultLastName.sendKeys(lastName);
    }

    public void fillSecondAdultName(String name) {
        secondAdultName.sendKeys(name);
    }

    public void fillSecondAdultLastName(String lastName) {
        secondAdultLastName.sendKeys(lastName);
    }

    public void fillThirdPassengerName(String name) {
        thirdPassengerName.sendKeys(name);
    }

    public void fillThirdPassengerLastName(String lastName) {
        thirdPassengerLastName.sendKeys(lastName);
    }


    public void selectCountry(String country) {
        ((JavascriptExecutor) FactoryDriver.getInstance()).executeScript("scroll(0,700)");
        phoneNumberCountryDropDown.click();
        for(WebElement el : phoneNumberCountryDropDownList){
            if(el.getText().equalsIgnoreCase(country))
            {
                el.click();
                break;
            }
        }
        phoneNumberCountryDropDown.click();
    }

    public void fillPhoneNumber(String phoneNumber) {
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public void fillCardNumber(String cardNumber) {
        this.cardNumber.sendKeys(cardNumber);
    }

    public void chooseCardType(String cardType) {
        cardTypeDropdown.click();
        for(WebElement el : cardTypeDropDownList){
            if(el.getText().equalsIgnoreCase(cardType))
            {
                el.click();
                break;
            }
        }
    }

    public void chooseExpiryMonth(String month) {
        expiryMonthDropdown.click();
        for(WebElement el : expiryMonthDropDownList){
            if(el.getText().equalsIgnoreCase(month))
            {
                el.click();
                break;
            }
        }
    }

    public void chooseExpiryYear(String year) {
        expiryYearDropdown.click();
        for(WebElement el : expiryYearDropDownList){
            if(el.getText().equalsIgnoreCase(year))
            {
                el.click();
                break;
            }
        }
    }

    public void fillSecurityCode(String code) {
        securityCode.sendKeys(code);
    }

    public void fillCardHolderName(String holderName) {
        cardHolderName.sendKeys(holderName);
    }

    public void fillAddress(String address) {
        addressLine1.sendKeys(address);
    }

    public void fillCity(String city) {
        this.city.sendKeys(city);
    }

    public void acceptTerms() {
        ((JavascriptExecutor) FactoryDriver.getInstance()).executeScript("scroll(0,1000)");
        acceptTermsCheckbox.click();
    }

    public void clickPayNowButton() {
        payNowButton.click();
    }
}
