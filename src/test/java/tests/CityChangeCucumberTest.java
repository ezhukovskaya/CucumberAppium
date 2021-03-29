package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(glue = {"stepDefinitions", "hooks"}, features = "src/test/resources/")
public class CityChangeCucumberTest extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = false)
    @Override
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
