package hooks;

import framework.capabilities.ApplicationDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(glue = "cucumber.steDefinitions")
public class ApplicationHooks {
    @Before
    public void openApplication() {
        ApplicationDriver.launch();
    }

    @After(order = 0)
    public void closeApplication() {
        ApplicationDriver.quit();
    }
}
