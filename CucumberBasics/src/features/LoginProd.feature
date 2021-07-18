@bvt
Feature: Login Prod

	To login to actiTime.com, we need to enter 
valid login credentials

@sprint1
Scenario: Login to application with valid credentials 

	Given user navigates to actiTime website 
	When user validates loginpage title 
	Then user enters "admin" username 
	And user enters "manger" password 
	And user enters "dob" as dob
	And clicks on login button 
	Then user "should be" successfully logged in 
	
	@sprint2
Scenario: Login to application with valid credentials 

	Given user navigates to actiTime website 
	When user validates loginpage title 
	Then user enters "admin" username 
	And user enters "manger" password 
	And user enters "dob" as dob
	And clicks on login button 
	Then user "should be" successfully logged in 
	
Scenario: Login with client credentials

	Given user navigates to actiTime website 
	When user validates loginpage title 
	Then client clicks on client-login options
	And client enters his client Passcode
	Then user enters "admin" username 
	And user enters "manger" password 
	And user enters "dob" as dob
	And clicks on login button 
	Then user "should be" successfully logged in 	
	
	