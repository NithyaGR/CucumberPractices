package com.acti.Helper;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.Base.DriverScript;
import com.acti.Utils.Generic;

public class HelperClass extends DriverScript {
	
	WebDriver driver;
	JavascriptExecutor je;
	TakesScreenshot ts;
	
	
	/*
	 * public HelperClass(WebDriver driver) { this.driver = driver; }
	 */
	 
	
	public void scrollPage(WebDriver driver, WebElement ele) {
		System.out.println("scrolling down");
		Generic.fnWait();
		je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", ele);
		Generic.fnWait();
		System.out.println("Done scrolling down");
	}
	
	public String takeScreenShot(WebDriver driver, String screenShotName) throws IOException {
		ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println("The location of source File is :"+sourceFile.getAbsolutePath());
		String destPath = System.getProperty("user.dir")+"\\screenshots\\"+screenShotName+".jpg";
		//Calendar.getInstance().getTimeInMillis()%1000000000
		File destFile = new File(destPath);
		FileUtils.copyFile(sourceFile, destFile);
		return destPath;
	
		
	}
	public void waitFunction(WebDriver driver, WebElement ele, int timeInSec) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeInSec);
		wait.until(ExpectedConditions.visibilityOf(ele));
			
		
	}
}
