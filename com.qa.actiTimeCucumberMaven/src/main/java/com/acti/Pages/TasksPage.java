package com.acti.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Helper.HelperClass;
//import com.acti.Utils.Generic;
import com.acti.Utils.Generic;

public class TasksPage extends DriverScript{
	
	HelperClass helperObj = new HelperClass();
	
	@FindBy (xpath="//div[text()='Add New']") WebElement addNewButton;
	@FindBy (xpath="//div[text()='+ New Customer']") WebElement addNewCustomer;
	@FindBy (xpath ="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']") WebElement nameTB;
	@FindBy (xpath="//div[@class='inputContainer']//textarea[@placeholder='Enter Customer Description']") WebElement descTB;
	@FindBy (xpath="//div[@class='emptySelection']") WebElement copyProjectsDD;
	@FindBy (xpath="//div[text()='Create Customer']") WebElement createCustomerBtn;
	@FindBy (xpath="//span[@class='innerHtml']") WebElement toastMessage;
	String xPath = "//div[contains(@class,'itemRow cpItemRow')][contains(text(),'%%')]";
	@FindBy (xpath="//div[@class='customersProjectsTreeContainer']//preceding::input[@placeholder='Start typing name ...']") WebElement searchTB;
	@FindBy (xpath="//span[@class='highlightToken']") WebElement custNameBtn;
	@FindBy (xpath="(//span[@class='highlightToken']//following::div[@class='editButton'])[1]") WebElement editBtn;
	@FindBy (xpath="(//div[@class='action' and text()='ACTIONS'])[1]") WebElement actionsBtn;
	@FindBy (xpath="//div[@class='title' and text()='Delete']") WebElement deleteBtn;
	@FindBy (xpath="//span[contains(@class,'submitTitle') and text()='Delete permanently']") WebElement permDeleteBtn;

	
	public TasksPage() {
		PageFactory.initElements(driver, this);
		//helperObj = new HelperClass();
	}
	
	public void clickOnAddNewBtn() {
		addNewButton.click();
	}
	public void clickOnNewCustomer() {
		addNewCustomer.click();
	}
	public void enterCustomerName(String customerName) {
		nameTB.sendKeys(customerName);
	}
	public void enterDescription(String description) {
		descTB.sendKeys(description);
	}
	public void clickOncopyProjectsDD() {
		copyProjectsDD.click();
	}
	public void selectProject(String project) {
		System.out.println(xPath);		
		String xpathExpression = xPath.replaceAll("%%", project);
		System.out.println(xpathExpression);
		driver.findElement(By.xpath(xpathExpression)).click();
		
	}
	public void clickOnCreateCustomer() {
		createCustomerBtn.click();
	}
	public String verfiyToastMEssage() {
		return toastMessage.getText();
	}
	
	public void searchProject(String text) {
		searchTB.sendKeys(text);
	}
	public void clickOncustNameBtn() {
		helperObj.waitFunction(driver,custNameBtn, 3);
		custNameBtn.click();
	}
	public void clickOnEditBtn() {
		editBtn.click();
	}
	public void clickOnActionsBtn() {
		Generic.fnWait();
		//helperObj.waitFunction(actionsBtn, 10);
		//Generic.fnWait();
		actionsBtn.click();
	}
	public void clickOnDeleteBtn() {
		Generic.fnWait();
		//helperObj.waitFunction(deleteBtn, 3);
		//Generic.fnWait();
		deleteBtn.click();
	}
	public void clickOnpermDeleteBtn() {
		Generic.fnWait();
		//helperObj.waitFunction(permDeleteBtn, 10);
		helperObj.scrollPage(driver,permDeleteBtn);
		//helperObj.waitFunction(permDeleteBtn, 10);
		//Generic.fnWait();
		permDeleteBtn.click();
	}
	
	
}
