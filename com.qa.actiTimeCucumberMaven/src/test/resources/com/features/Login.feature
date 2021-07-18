#Author: your.email@your.domain.com
Feature: Login Page
  
  To login to the actiTime application user provides 
  valid username and password

  Scenario: Login functionality of actiTime
    Given user navigates to actiTime application
    And validates login page title
    Then user enters "admin" as a username
    And user enters "manager" as a password
    And clicks on the login button
    Then user validates that the actiTime-Enter-TimeTrack page is displayed
        