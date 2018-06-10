@flights_booking
Feature: Booking a flight on www.ryanair.com
	As a user
	I want to be able book a flight
	On www.ryanair.com

  Scenario: User should be logged in to pay for booking
	Given I am on main page
    When I log in to personal account
	Then I should be logged in

  Scenario:   Booking up to a declined payment on
	#Given User makes a booking from “Dublin” to “Wroclaw” on 12/03/2017 for 2 adults and 1 child
    Given I am on main page
	When User picks flight type One Way
	And User enters Departure airport 'Wroclaw' and Destination airport 'Dublin'
    #Then I see flight out date field
	And User enters passengers
	And User enters fly out date on '29/06/2018'
    #And User enters passengers 1 child
	And User proceeds by clicking ‘Let’s go’
	Then User should see available flights
	When User clicks on 'Price' ticket
	And User picks fare package 'Standard Fare'
	And User proceeds by clicking Continue
    And I select seats for 3 passengers
	And I checkout my booking
    And I fill in adult passenger details 'Mr', 'John' and 'Smith'
    And I fill in second adult passenger details 'Mrs', 'Jane' and 'Smith'
    And I fill in child passenger details 'Mark' and 'Smith'
    And I fill in contact details country 'Poland' and phone number '12345678'
    When I fill in card details '5555555555555557', 'MasterCard', '10'/'2018', '265' and 'John Smith'
    And I fill in billing address details '28 Sun street' and city 'Wroclaw'
    And I pay for booking
	#Then I should get payment declined message

    #Given I make a booking from “Dublin” to “Wroclaw” on 12/03/2017 for 2 adults and 1 child
    #And I confirm booking with flight details
    #When I pay for booking with card details “5555 5555 5555 5557”, “10/18” and “265”
    #Then I should get payment declined message