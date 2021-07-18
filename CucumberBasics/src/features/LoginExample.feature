Feature: Login with Example 

	To login to actiTime application, with multiple userss
	by using Examples and scenario outline.  
enter a valid user name and password

Scenario Outline: Login to actiTime application with valid credentials 

	Given user navigates to actiTime website 
	When user validates loginpage title 
	Then user enters "<username>" username 
	And user enters "<password>" password 
	And user enters his age
	|Age|
	|Above 18|
	|Below 18|
	And user selects gender and country options
	|Gender|Country|
	|Male | India|
	|Female| USA |
	And clicks on login button 
	Then user "<status>" successfully logged in 
	
	
	Examples: 
	|username | password |  status  |
	|admin    | manager  | should be| 
	|admin    | pass@123 | should not be|
	|nithya   | manager  | should not be|
	|Krishnik | pass123  | should not be|
	
	
	
	
