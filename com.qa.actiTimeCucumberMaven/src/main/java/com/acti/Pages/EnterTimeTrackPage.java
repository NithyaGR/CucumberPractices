package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.HelperClass;
import com.acti.Utils.Generic;

public class EnterTimeTrackPage extends DriverScript {
	HelperClass helperObj;
	
	@FindBy (xpath="//a[@class='userProfileLink username ']") WebElement loggedInUserText;
	@FindBy (linkText="Logout") WebElement logoutLink;
	@FindBy (id="container_tasks") WebElement tasksMenu;

	public EnterTimeTrackPage() {
		PageFactory.initElements(driver, this);
		helperObj = new HelperClass();
	}
	
	public void clickOnTasks() {
		Generic.fnWait();
		helperObj.waitFunction(driver,tasksMenu,10);
		tasksMenu.click();
	}
	
	public void clickOnLogout() {
		logoutLink.click();
	}
	public String getLoggedInUser() {
		 return loggedInUserText.getText();
	}
}
