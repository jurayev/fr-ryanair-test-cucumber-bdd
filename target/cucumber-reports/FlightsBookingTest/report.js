$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/flightsBooking.feature");
formatter.feature({
  "name": "Booking a flight on www.ryanair.com",
  "description": "\tAs a user\n\tI want to be able book a flight\n\tOn www.ryanair.com",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@flights_booking"
    }
  ]
});
formatter.scenario({
  "name": "User should be logged in to pay for booking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@flights_booking"
    }
  ]
});
formatter.step({
  "name": "I am on main page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasePageSteps.userIsOnMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in to personal account",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.iLogInToPersonalAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BasePageSteps.iShouldBeLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Booking up to a declined payment on",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@flights_booking"
    }
  ]
});
formatter.step({
  "name": "I am on main page",
  "keyword": "Given "
});
formatter.match({
  "location": "BasePageSteps.userIsOnMainPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User picks flight type One Way",
  "keyword": "When "
});
formatter.match({
  "location": "FlightsSearchPageSteps.pickFlightTypeOneWay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Departure airport \u0027Wroclaw\u0027 and Destination airport \u0027Dublin\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsSearchPageSteps.userEntersAirportDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters passengers",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsSearchPageSteps.userEntersPassengersAdult()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters fly out date on \u002729/06/2018\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsSearchPageSteps.userEntersFlyOutDateOn(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds by clicking ‘Let’s go’",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsSearchPageSteps.userProceedsByClickingLetSGo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see available flights",
  "keyword": "Then "
});
formatter.match({
  "location": "FlightsBookingPageSteps.userShouldSeeAvailableFlights()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \u0027Price\u0027 ticket",
  "keyword": "When "
});
formatter.match({
  "location": "FlightsBookingPageSteps.userClicksOnPriceTicket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User picks fare package \u0027Standard Fare\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPageSteps.userPicksFarePackageStandardFare()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeds by clicking Continue",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPageSteps.userProceedsByClickingContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select seats for 3 passengers",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingSeatsSelectionPageSteps.iSelectSeatsForPassengers(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I checkout my booking",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingExtrasPageSteps.iCheckoutMyBooking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in adult passenger details \u0027Mr\u0027, \u0027John\u0027 and \u0027Smith\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInAdultPassengerDetails(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in second adult passenger details \u0027Mrs\u0027, \u0027Jane\u0027 and \u0027Smith\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInSecondAdultPassengerDetails(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in child passenger details \u0027Mark\u0027 and \u0027Smith\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInChildPassengerDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in contact details country \u0027Poland\u0027 and phone number \u002712345678\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInContactDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in card details \u00275555555555555557\u0027, \u0027MasterCard\u0027, \u002710\u0027/\u00272018\u0027, \u0027265\u0027 and \u0027John Smith\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInCardDetailsVisaAndJohnSmith(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in billing address details \u002728 Sun street\u0027 and city \u0027Wroclaw\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iFillInBillingAddressDetails(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I pay for booking",
  "keyword": "And "
});
formatter.match({
  "location": "FlightsBookingPaymentPageSteps.iPayForBooking()"
});
