#Author: your.email@your.domain.com
Feature: Tasks page feature
  In order to create a new customer in tasks, a user logs in to the
  application and clicks on tasks menu from the enter time page to add a new customer, project
  or a new task itslef.

  Background:
    Given user navigates to actiTime application
    And validates login page title
    Then user enters "admin" as a username
    And user enters "manager" as a password
    And clicks on the login button
    Then user clicks on Tasks menu

  Scenario: Adding a new customer in tasks page
    And user clicks on Add New button 
    And user clicks on Add New Customer Option
    And user enters "Test customerabcdef" as a customer name
    And user enters "Test 123" as Description
    And user clicks on copy_Project dropdown 
    And selects "Galaxy Corporation" as an option
    And clicks on Create_Customer button
    Then validates the success message
    And logs out from the application

  Scenario: Deleting the customer
   
		And user enters "Test customerabcdef" to search
		And clicks on the customerName button
		And clicks on the settings button
		And clicks on the action button
		And clicks on the delete button
		And clicks on the delete permanently button
		Then validates the success message
		And logs out from the application
		