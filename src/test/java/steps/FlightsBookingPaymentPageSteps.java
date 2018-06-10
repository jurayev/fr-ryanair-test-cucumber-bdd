package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.FlightsBookingPaymentPage;

public class FlightsBookingPaymentPageSteps {

    private FlightsBookingPaymentPage flightsBookingPaymentPage;

    public FlightsBookingPaymentPageSteps(){
        flightsBookingPaymentPage = new FlightsBookingPaymentPage();
    }

    @And("^I fill in adult passenger details '([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
    public void iFillInAdultPassengerDetails(String title, String name, String lastName) {
        flightsBookingPaymentPage.chooseAdultTitle(title);
        flightsBookingPaymentPage.fillAdultName(name);
        flightsBookingPaymentPage.fillAdultLastName(lastName);
    }

    @And("^I fill in second adult passenger details '([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
    public void iFillInSecondAdultPassengerDetails(String title, String name, String lastName) {
        flightsBookingPaymentPage.chooseSecondAdultTitle(title);
        flightsBookingPaymentPage.fillSecondAdultName(name);
        flightsBookingPaymentPage.fillSecondAdultLastName(lastName);
    }

    @And("^I fill in child passenger details '([^\"]*)' and '([^\"]*)'$")
    public void iFillInChildPassengerDetails(String name, String lastName) {
        flightsBookingPaymentPage.fillThirdPassengerName(name);
        flightsBookingPaymentPage.fillThirdPassengerLastName(lastName);
    }

    @And("^I fill in contact details country '([^\"]*)' and phone number '([^\"]*)'$")
    public void iFillInContactDetails(String country, String phoneNumber) {
        flightsBookingPaymentPage.selectCountry(country);
        flightsBookingPaymentPage.fillPhoneNumber(phoneNumber);
    }

    @When("^I fill in card details '([^\"]*)', '([^\"]*)', '([^\"]*)'/'([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
    public void iFillInCardDetailsVisaAndJohnSmith(String cardNumber, String cardType, String month, String year, String code, String holderName) {
        flightsBookingPaymentPage.fillCardNumber(cardNumber);
        flightsBookingPaymentPage.chooseCardType(cardType);
        flightsBookingPaymentPage.chooseExpiryMonth(month);
        flightsBookingPaymentPage.chooseExpiryYear(year);
        flightsBookingPaymentPage.fillSecurityCode(code);
        flightsBookingPaymentPage.fillCardHolderName(holderName);
    }

    @And("^I fill in billing address details '([^\"]*)' and city '([^\"]*)'$")
    public void iFillInBillingAddressDetails(String address, String city) {
        flightsBookingPaymentPage.fillAddress(address);
        flightsBookingPaymentPage.fillCity(city);
    }

    @And("^I pay for booking$")
    public void iPayForBooking() {
        flightsBookingPaymentPage.acceptTerms();
        flightsBookingPaymentPage.clickPayNowButton();
    }
}
