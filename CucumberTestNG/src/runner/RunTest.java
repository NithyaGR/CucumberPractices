package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "./src/features/LoginProd.feature",
				 glue="stepDefinitions", 
				 monochrome=true,
				 dryRun=false,
				 //tags={"@bvt"},
				// tags={"@bvt","@sprint1"},
				 plugin = {"pretty", "html:target/cucumber"})

public class RunTest extends AbstractTestNGCucumberTests{

}
