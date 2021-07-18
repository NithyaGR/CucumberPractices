package stepDefinitions;
import cucumber.api.java.en.*;

public class LoginProdSteps {
	
	@Then("^user enters \"(.*)\" as dob$")
	public void user_enters(String dob)  {
		System.out.println("@Then: user enters "+dob);
	    
	}
	@Then("^client clicks on client-login options$")
	public void client_clicks_on_client_login_options()  {
	    System.out.println("@Then: client clicks on client-login");
	}

	@And("^client enters his client Passcode$")
	public void client_enters_his_client_Passcode() {
		System.out.println("@nd: client enters his client passcode");
		
	}


}
