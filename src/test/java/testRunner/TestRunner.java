package testRunner;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/feature", // Specify the path to your feature files
    glue = "stepDefination",      // Specify the package for your step definitions
   // tags = "@smoke",                           // Specify tags to include/exclude scenarios
    plugin = {"pretty", "html:target/cucumber-reports"} // Specify plugins for reporting
)
public class TestRunner extends AbstractTestNGCucumberTests {
   
	@Override
	@DataProvider(parallel=true)
		public Object[][] scenarios(){
			return super.scenarios();
			
		}
		
	}
