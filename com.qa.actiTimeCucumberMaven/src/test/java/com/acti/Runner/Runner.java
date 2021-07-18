package com.acti.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/com/features/", 
                 glue="com.acti.Steps",
                 dryRun=false,
                 plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","html:target/cucumber"})
public class Runner extends AbstractTestNGCucumberTests{
	

}
