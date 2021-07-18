package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class CarsBuySteps {
	
	WebDriver driver;
	
	@Given("^user navigates to \"([^\"]*)\" application$")
	public void user_navigates_to_application(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","./Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    
	}

	@When("^user validates the title page$")
	public void user_validates_the_title_page() throws Throwable {
	    System.out.println(driver.getTitle());
	    
	}

	@Then("^user mouse hover on buy \\+ sell$")
	public void user_mouse_hover_on_buy_sell() throws Throwable {
	    
	    
	}

	@Then("^user clicks New under Buy category$")
	public void user_clicks_New_under_Buy_category() throws Throwable {
	    
	    
	}

	@Then("^user selects \"([^\"]*)\" from the AnyMake dropdown$")
	public void user_selects_from_the_AnyMake_dropdown(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user selects \"([^\"]*)\" from the AnyModel dropdown$")
	public void user_selects_from_the_AnyModel_dropdown(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user selects \"([^\"]*)\" from the AnyLocation dropdown$")
	public void user_selects_from_the_AnyLocation_dropdown(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user selects \"([^\"]*)\" from the Price dropdown$")
	public void user_selects_from_the_Price_dropdown(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user clicks on Find My Next Car button$")
	public void user_clicks_on_Find_My_Next_Car_button() throws Throwable {
	    
	    
	}

	@Then("^validates the result$")
	public void validates_the_result() throws Throwable {
	    
	    
	}



}
