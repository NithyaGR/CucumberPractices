package com.acti.Steps;


import com.acti.Utils.Generic;

import io.cucumber.java.en.*;

public class TasksSteps extends BasePageObjects {
	
	String actualCCSMsg;
	String customer;
	
	@Then("user clicks on Add New button")
	public void user_clicks_on_Add_New_button() {
	    tp.clickOnAddNewBtn();
	   
	}

	@Then("user clicks on Add New Customer Option")
	public void user_clicks_on_Add_New_Customer_Option() {
	    
	   tp.clickOnNewCustomer();
	}

	@Then("user enters {string} as a customer name")
	public void user_enters_as_a_customer_name(String customerName) {
	   customer = Generic.getRandomCustomerName(5);
	   tp.enterCustomerName(customerName);
	}

	@Then("user enters {string} as Description")
	public void user_enters_Description(String description) {
	    tp.enterDescription(description);
	   
	}

	@Then("user clicks on copy_Project dropdown")
	public void user_clicks_on_copy_Project_dropdown() {
	    
	   tp.clickOncopyProjectsDD();
	}

	@Then("selects {string} as an option")
	public void selects_an_option(String project) {
	    
	   tp.selectProject(project);
	}

	@Then("clicks on Create_Customer button")
	public void clicks_on_Create_Customer_button() {
	    
		tp.clickOnCreateCustomer();
	   
	}

	@Then("validates the success message")
	public void validates_the_success_message() {
	    actualCCSMsg = tp.verfiyToastMEssage();
	    System.out.println(actualCCSMsg);
	   
	}

	@Then("logs out from the application")
	public void logs_out_from_the_application() {
	    
	   etp.clickOnLogout();
	}
	
	@Then("user enters {string} to search")
	public void user_enters_to_search(String project) {
	   tp.searchProject(project);
	    
	}

	@Then("clicks on the settings button")
	public void clicks_on_the_settings_button() {
	   tp.clickOnEditBtn();
	    
	}

	@Then("clicks on the action button")
	public void clicks_on_the_action_button() {
	   tp.clickOnActionsBtn();
	    
	}

	@Then("clicks on the delete button")
	public void clicks_on_the_delete_button() {
	   
	    tp.clickOnDeleteBtn();
	}

	@Then("clicks on the delete permanently button")
	public void clicks_on_the_delete_permanently_button() {
	   
	    tp.clickOnpermDeleteBtn();
	}
	@Then("clicks on the customerName button")
	public void clicks_on_the_customerName_button() {
	    tp.clickOncustNameBtn();
	}




}
