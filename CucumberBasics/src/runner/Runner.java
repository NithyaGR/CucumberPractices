package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/features/LoginProd.feature",
				 glue="stepDefinitions", 
				 monochrome=true,
				 dryRun=false,
				 tags={"@bvt"},
				// tags={"@bvt","@sprint1"},
				 plugin = {"pretty", "html:target/cucumber"})
public class Runner {

}
