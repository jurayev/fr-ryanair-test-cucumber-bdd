package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.FlightsBookingPaymentPage;
import utils.ExplicitWait;
import utils.LogUtils;

/***
 * This class contains Booking Payment steps
 */
public class FlightsBookingPaymentPageSteps {

    private FlightsBookingPaymentPage page;

    public FlightsBookingPaymentPageSteps(){
        page = new FlightsBookingPaymentPage();
    }

    @When("^I fill in adult passenger details '([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
    public void iFillInAdultPassengerDetails(String title, String name, String lastName) {
        page.chooseAdultTitle(title);
        page.fillAdultName(name);
        page.fillAdultLastName(lastName);
    }

    @When("^I fill in second adult passenger details '([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
    public void iFillInSecondAdultPassengerDetails(String title, String name, String lastName) {
        page.chooseSecondAdultTitle(title);
        page.fillSecondAdultName(name);
        page.fillSecondAdultLastName(lastName);
    }

    @When("^I fill in child passenger details '([^\"]*)' and '([^\"]*)'$")
    public void iFillInChildPassengerDetails(String name, String lastName) {
        page.fillThirdPassengerName(name);
        page.fillThirdPassengerLastName(lastName);
    }

    @When("^I fill in contact details country '([^\"]*)' and phone number '([^\"]*)'$")
    public void iFillInContactDetails(String country, String phoneNumber) {
        page.selectCountry(country);
        page.fillPhoneNumber(phoneNumber);
    }

    @When("^I fill in card details '([^\"]*)', '([^\"]*)', '([^\"]*)'/'([^\"]*)', '([^\"]*)' and '([^\"]*)'$")
    public void iFillInCardDetailsVisaAndJohnSmith(String cardNumber, String cardType, String month, String year, String code, String holderName) {
        page.fillCardNumber(cardNumber);
        page.chooseCardType(cardType);
        page.chooseExpiryMonth(month);
        page.chooseExpiryYear(year);
        page.fillSecurityCode(code);
        page.fillCardHolderName(holderName);
    }

    @When("^I fill in billing address details '([^\"]*)' and city '([^\"]*)'$")
    public void iFillInBillingAddressDetails(String address, String city) {
        page.fillAddress(address);
        page.fillCity(city);
    }

    @When("^I pay for booking$")
    public void iPayForBooking() {
        page.acceptTerms();
        page.clickPayNowButton();
    }

    @Then("^I should get payment declined message$")
    public void iGetPaymentDeclinedMessage() {
        ExplicitWait.invisibilityOfElement(page.getPlaneLoadingSpinner());
        Assert.assertTrue("Payment error is not displayed", page.getPaymentError().isDisplayed());
        String expectedErrorMsg = FlightsBookingPaymentPage.PAYMENT_ERROR_TITLE_MESSAGE;
        String actualErrorMsg = page.getPaymentErrorTitleMessage();
        //initially I checked error message body text to verify that payment was declined due to incorrect payment details
        //however it produces different error message (smth like 'same reservation..') after each new run if I keep data static
        //so for now decided to leave it as it is
        Assert.assertEquals(
                String.format("Payment error title message is incorrect. \nExpected: '%s'\nActual: '%s'",expectedErrorMsg,actualErrorMsg),
                        expectedErrorMsg, actualErrorMsg
                );
        LogUtils.logInfo(String.format("Payment error message is '%s'", actualErrorMsg));

    }
}
