package com.acti.Steps;

import com.acti.Pages.EnterTimeTrackPage;

import io.cucumber.java.en.Then;

public class EnterTimeTrackSteps {
	
	EnterTimeTrackPage etp = new EnterTimeTrackPage();
	
	@Then("user clicks on Tasks menu")
	public void user_clicks_on_Tasks_menu() {
	    etp.clickOnTasks();
	   
	}


}
