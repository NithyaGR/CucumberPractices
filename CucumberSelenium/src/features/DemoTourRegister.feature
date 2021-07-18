Feature: Demo Tour User Registration 

	To register a user to create her/his own 
account in the application.

Scenario Outline: To register a user in demo tour application. 
	Given user navigates to demo tour application 
	Then  clicks on the register button 
	Then enters "<firstName>" in the FirstName field 
	Then enters "<LastName>" in the LastName field 
	Then enters "<phone>" in the phone field 
	Then enters "<email>" in the email field 
	And enters "<Address>" in the address field 
	And enters "<City>" in the city field 
	And enters "<State>" in the state field 
	And enters "<ZipCode>" in the zipcode field 
	Then chooses "<Country>" from the drop down 
	Then enters "<UserName>" in the user name field 
	Then enters "<Password>" in the password field 
	Then enters "<Confirm Password>" in the confirm password field 
	And clicks on the Submit button 
	Then verifies the confirmation message
	
	
	Examples: 
	
		| firstName | LastName | phone  | email      | Address       | City    | State    | ZipCode | Country | UserName | Password | Confirm Password |
		| Kalyani   | KK       |12345678|kk@gmail.com| 123, asdfg rd | Teaneck | Frankfurt|12345    | FRANCE  | kkk      | pass@123 | pass@123         |    
		
		
		
	