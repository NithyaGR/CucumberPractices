package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverScript {
	
	protected static WebDriver driver;
	protected static Properties prop;
	
	public DriverScript() {
		
		try {
			File srcFile = new File("./src/test/resources/configuration/config.properties");
			FileInputStream fis = new FileInputStream(srcFile);
			prop = new Properties();
			prop.load(fis);
		}
		catch (Exception e) {
			System.out.println("File Not Found: "+e.getMessage());
		}
	}
	
	public static void initBrowsers() {
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/browsers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else 
			System.out.println("The browser is not defined");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		launchApplication();
		
	}
	
	public static void launchApplication() {
		String url = prop.getProperty("url");
		driver.get(url);
	}
	public static void closeApplication() {
		driver.quit();
	}

}
