package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class LoginPage extends DriverScript{
	
	//***************Page Element Identification ***************************
	
	@FindBy (id="username") WebElement userNameTB;
	@FindBy (name="pwd") WebElement passwordTB;
	@FindBy (id="loginButton") WebElement loginBtn;
	@FindBy (xpath="//td[@id='logoContainer']//div[@class='atLogoImg']") WebElement actiLogoImg;
	
	//***************Page initialization **********************************
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//**************Page Actions/Methods ************************************
	
	public void enterUserName(String userName) {
		userNameTB.sendKeys(userName);
	}
	public void enterPassword(String password) {
		passwordTB.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginBtn.click();
	}
	public boolean getLogoStatus() {
		return actiLogoImg.isDisplayed();
	}
	public String getTitle() {
		return driver.getTitle();
	}

}
