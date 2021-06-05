package Runner;

import Tests.TestBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature",glue = {"Steps"},plugin = {"pretty","html:target/cucumber-html-report"},strict = true, dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

    public class TestRunner1 extends TestBase {
        //Run From Here

    }
}
