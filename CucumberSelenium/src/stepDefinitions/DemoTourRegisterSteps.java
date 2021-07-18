package stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.*;

public class DemoTourRegisterSteps {
	
	WebDriver driver;
	String expectedResult = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
	String actualResult;
	SoftAssert sa;
	
	@Given("^user navigates to demo tour application$")
	public void user_navigates_to_demo_tour_application() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
	    //System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	}

	@Then("^clicks on the register button$")
	public void clicks_on_the_register_button() throws Throwable {
	    driver.findElement(By.linkText("REGISTER")).click();
	    
	}

	@Then("^enters \"([^\"]*)\" in the FirstName field$")
	public void enters_in_the_FirstName_field(String firstName) throws Throwable {
	    driver.findElement(By.name("firstName")).sendKeys(firstName);
	    
	}

	@Then("^enters \"([^\"]*)\" in the LastName field$")
	public void enters_in_the_LastName_field(String lastName) throws Throwable {
		 driver.findElement(By.name("lastName")).sendKeys(lastName);
	    
	}

	@Then("^enters \"([^\"]*)\" in the phone field$")
	public void enters_in_the_phone_field(String phone) throws Throwable {
		 driver.findElement(By.name("phone")).sendKeys(phone);
	    
	}

	@Then("^enters \"([^\"]*)\" in the email field$")
	public void enters_in_the_email_field(String email) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(email);
	    
	}

	@Then("^enters \"([^\"]*)\" in the address field$")
	public void enters_in_the_address_field(String address) throws Throwable {
		 driver.findElement(By.name("address1")).sendKeys(address);
	    
	}

	@Then("^enters \"([^\"]*)\" in the city field$")
	public void enters_in_the_city_field(String city) throws Throwable {
		 driver.findElement(By.name("city")).sendKeys(city);
	    
	}

	@Then("^enters \"([^\"]*)\" in the state field$")
	public void enters_in_the_state_field(String state) throws Throwable {
		 driver.findElement(By.name("state")).sendKeys(state);
	    
	}

	@Then("^enters \"([^\"]*)\" in the zipcode field$")
	public void enters_in_the_zipcode_field(String zipCode) throws Throwable {
		 driver.findElement(By.name("postalCode")).sendKeys(zipCode);
	    
	    
	}

	@Then("^chooses \"([^\"]*)\" from the drop down$")
	public void chooses_from_the_drop_down(String country) throws Throwable {
	    Select select = new Select (driver.findElement(By.name("country")));
	    select.selectByVisibleText(country);
	    
	}

	@Then("^enters \"([^\"]*)\" in the user name field$")
	public void enters_in_the_user_name_field(String userName) throws Throwable {
		 driver.findElement(By.id("email")).sendKeys(userName);
	    
	}

	@Then("^enters \"([^\"]*)\" in the password field$")
	public void enters_in_the_password_field(String password) throws Throwable {
		 driver.findElement(By.name("password")).sendKeys(password);
	    
	}

	@Then("^enters \"([^\"]*)\" in the confirm password field$")
	public void enters_in_the_confirm_password_field(String confirmPassword) throws Throwable {
		 driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
	    
	}

	@Then("^clicks on the Submit button$")
	public void clicks_on_the_Submit_button() throws Throwable {
		 driver.findElement(By.name("submit")).click();
	    
	}
	@Then("^verifies the confirmation message$")
	public void verifies_the_confirmation_message() throws Throwable {
	  System.out.println(driver.findElement(By.xpath("//a[text()=' sign-in ']/ancestor:: p//font")).getText());
	  sa = new SoftAssert();
	  actualResult = driver.findElement(By.xpath("//a[text()=' sign-in ']/ancestor:: p//font")).getText();
	  sa.assertEquals(actualResult, expectedResult);
	}




}
