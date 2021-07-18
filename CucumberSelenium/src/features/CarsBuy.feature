Feature: Testing Buy Cars feature from Carsguide.com.au 

	To buy a specific car from the application
carsguide.com.au, user follows some actions

Scenario: Buy a specific car from carsguide.com.au 

	Given user navigates to "https://www.carsguide.com.au/" application 
	When user validates the title page 
	Then user mouse hover on buy + sell 
	Then user clicks New under Buy category 
	And user selects "Audi" from the AnyMake dropdown 
	And user selects "A1" from the AnyModel dropdown 
	And user selects "NSW-A11" from the AnyLocation dropdown 
	And user selects "25000" from the Price dropdown 
	Then user clicks on Find My Next Car button 
	Then validates the result 
	