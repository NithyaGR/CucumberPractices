package com.acti.Steps;

import com.acti.Base.DriverScript;
import com.acti.Pages.EnterTimeTrackPage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.TasksPage;

public class BasePageObjects extends DriverScript{
	
	LoginPage lp = new LoginPage();
	EnterTimeTrackPage etp = new EnterTimeTrackPage();
	TasksPage tp = new TasksPage();
	String expectedLPTitle = prop.getProperty("LoginPageTitle");
	String expectedLoggedInUser=prop.getProperty("loggedInUser");
	String custCreatesSuccessMsg = "'Test 789123' has been created";
	
	

}
