Feature: Login 

	To login to actiTime.com, we need to enter 
valid login credentials

Background:

	Given user navigates to actiTime website 
	When user validates loginpage title 


Scenario: Login to application with valid credentials 
	
	Then user enters "valid" username 
	And user enters "valid" password 
	And clicks on login button 
	Then user "should be" successfully logged in 
	
Scenario: Login to application with invalid credentials

	Then user enters "invalid" username 
	And user enters "invalid" password 
	And clicks on login button 
	Then user "should not be" successfully logged in 
	
	
	

	
	
	
	
 