package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/",
dryRun = false,
 plugin = {"pretty","html:target/cucumber-report/htmltest",
	"json:target/cucumber-report/SmokeTestReport/testresults.json"},
glue= "stepDefination"
 ,tags={"@P9"}
)
public class RunTest {

}
