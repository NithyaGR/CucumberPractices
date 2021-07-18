package com.acti.Steps;

import com.acti.Base.DriverScript;
import com.acti.Helper.HelperClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps extends DriverScript {
	
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	Scenario scenario;
	public ExtentTest logger;
	HelperClass helperObject = new HelperClass();
	
		
	@Before
	public void preScenario() {
		DriverScript.initBrowsers();
		
	}
	
	@After
	public void postScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.getStatus();
			try {
			ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(helperObject.takeScreenShot(driver, scenario.getName()));
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		 }
		DriverScript.closeApplication();

    }
}	
