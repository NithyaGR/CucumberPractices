package com.acti.Steps;

import org.testng.Assert;

import com.acti.Base.DriverScript;


import io.cucumber.java.en.*;

public class LoginSteps extends BasePageObjects {
	
	/*
	 * LoginPage lp = new LoginPage(); EnterTimeTrackPage etp = new
	 * EnterTimeTrackPage();
	 */
	String actualLPTitle, actualLoggedInUser;
	
	@Given("user navigates to actiTime application")
	public void user_navigates_to_actiTime_application() {
	    DriverScript.launchApplication();
	    
	}

	@Given("validates login page title")
	public void validates_login_page_title() {
	    
	    actualLPTitle = lp.getTitle();
	    Assert.assertEquals(actualLPTitle, expectedLPTitle);
	    Assert.assertTrue(actualLPTitle.contains(expectedLPTitle));
	}

	@Then("user enters {string} as a username")
	public void user_enters_as_a_username(String userName) {
	    
	    lp.enterUserName(userName);
	}

	@Then("user enters {string} as a password")
	public void user_enters_as_a_password(String password) {
	    
	    lp.enterPassword(password);
	}

	@Then("clicks on the login button")
	public void clicks_on_the_login_button() {
	    
	    lp.clickOnLoginButton();
	}

	@Then("user validates that the actiTime-Enter-TimeTrack page is displayed")
	public void user_validates_that_the_actiTime_Enter_TimeTrack_page_is_displayed() {
	    actualLoggedInUser = etp.getLoggedInUser();
	    Assert.assertEquals(actualLoggedInUser, expectedLoggedInUser);
	    
	}

}
