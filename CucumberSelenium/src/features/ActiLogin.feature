Feature: Login feature of actiTime application 

To test login functionality of actiTime Application as
a user, will enter valid user and password

Scenario: Test Login functionality of actiTime application
	Given user navigates to actiTime application
	When user validates the login page title
	Then user enters "admin" as a user name 
	And user enters "manager" as a password
	And user clicks on login button
	Then actiTime home page should be displayed
	And user clicks on logout button
	
	

