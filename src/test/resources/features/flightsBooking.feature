@flights_booking
Feature: Booking a flight on www.ryanair.com
	As a user
	I want to be able to book a flight
	On www.ryanair.com

  Scenario: Booking up to a declined payment on
		Given I am on main page
        And I log in to personal account
		When I make a search for booking from 'Wroclaw' to 'Dublin' on '29/06/2018' for 2 adults and 1 child
		And I book available flight
		And I select seats for 3 passengers
		And I checkout my booking
		And I fill in adult passenger details 'Mr', 'John' and 'Smith'
		And I fill in second adult passenger details 'Mrs', 'Jane' and 'Smith'
		And I fill in child passenger details 'Mark' and 'Smith'
		And I fill in contact details country 'Poland' and phone number '12345678'
		And I fill in card details '5555555555555557', 'MasterCard', '10'/'2018', '267' and 'John Smith'
		And I fill in billing address details '28 Sun street' and city 'Wroclaw'
		And I pay for booking
		Then I should get payment declined message