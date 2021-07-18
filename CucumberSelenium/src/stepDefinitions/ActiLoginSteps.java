package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class ActiLoginSteps {
	
	WebDriver driver;
	String actualTitle;
	String expTitle = "actiTIME - Login";
	SoftAssert sa;
	String homeTitleActual;
	String homeTitleExpected = "actiTime - Enter Time-Track";
	@Before
	public void preScenario(){
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Launching the browser");
	
	}
	@After
	public void postScenario(){
		System.out.println("Closing the browser");
		driver.quit();
	}
	@Given("^user navigates to actiTime application$")
	public void user_navigates_to_actiTime_application() throws Throwable {
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("Opening the app");
	    
	}

	@When("^user validates the login page title$")
	public void user_validates_the_login_page_title() throws Throwable {
	    actualTitle = driver.getTitle();
	    sa = new SoftAssert();
	    sa.assertEquals(actualTitle, expTitle, "TitleMatched-Verified");
	        
	    
	}

	@Then("^user enters \"([^\"]*)\" as a user name$")
	public void user_enters_as_a_user_name(String userName) throws Throwable {
		
		driver.findElement(By.id("username")).sendKeys(userName);
	    
	    
	}

	@And("^user enters \"([^\"]*)\" as a password$")
	public void user_enters_as_a_password(String password) throws Throwable {
	    
	    driver.findElement(By.name("pwd")).sendKeys(password);
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("loginButton")).click();
	    
	    
	}

	@Then("^actiTime home page should be displayed$")
	public void actitime_home_page_should_be_displayed() throws Throwable {
	    homeTitleActual = driver.getTitle();
	    sa.assertEquals(homeTitleActual,homeTitleExpected);
	    
	}

	@Then("^user clicks on logout button$")
	public void user_clicks_on_logout_button() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();
	    
	}



}
