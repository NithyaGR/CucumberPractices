package stepDefinitions;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class LoginSteps {
	
	@Before
	public void preScenario(){
		System.out.println("Launching the browser");
	}
	@After
	public void postScenario(){
		System.out.println("Closing the browser");
	}
	@Given("^user navigates to actiTime website$")
	public void user_navigates_to_actiTime_website()  {
		System.out.println("@Given: user navigates to actiTime");
	}

	@When("^user validates loginpage title$")
	public void user_validates_loginpage_title()  {
		System.out.println("@When: user validates loginpage");
	    
	}

	@Then("^user enters \"(.*)\" username$")
	public void user_enters_valid_username(String userName)  {
		System.out.println("@Then: user enters "+userName+" username");
	    
	}

	@Then("^user enters \"(.*)\" password$")
	public void user_enters_valid_password(String password)  {
		System.out.println("@Then: user enters "+password+" password");
	    
	}

	@Then("^clicks on login button$")
	public void clicks_on_login_button()  {
		System.out.println("@Then: user clicks on login button");
	    
	}

	@Then("^user \"(.*)\" successfully logged in$")
	public void user_should_be_successfully_logged_in(String status)  {
		System.out.println("@Then: user "+status+" successfully login to actiTime");
	    
	}
	@And("^user enters his age$")
	public void user_enters_his_age(List<String> list)  {
	    System.out.println("@And: user enters his age option: "+list.get(1));
	}
	@And("^user selects gender and country options$")
	public void user_selects_gender_and_country_options(DataTable table) {
	 List<Map<String, String>> data = table.asMaps(String.class, String.class);
	 System.out.println("@And: user selects "+data.get(1).get("Gender")+ " as a gender");
	 System.out.println("@And: user selects "+data.get(1).get("Country")+" as a location");
	 System.out.println(data.get(0).get("Gender"));
	 System.out.println(data.get(0).get("Country"));
		
		
	   
	}

	


}
