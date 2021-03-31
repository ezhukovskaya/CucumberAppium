package stepDefinitions;

import application.windows.pageObject.screens.SecretClosetStartScreen;
import framework.base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import steps.SecretClosetStartSteps;

public class StartPageStepDefinitions extends CucumberSteps {
    @And("The city is {string}")
    public void theCityIs(String city) {
        SecretClosetStartSteps.verifyCity(city);
    }

    @Given("I am on Start screen")
    public void iAmOnStartScreen() {
        BaseSteps.verifyIsDisplayed(SecretClosetStartScreen.class);
    }

    @Then("I go to Select City screen")
    public void iGoToSelectCityScreen() {
        SecretClosetStartSteps.selectCity();
    }

    @Then("I get Product brand name")
    public void iGetProductBrandName() {
        setProductBrandName(SecretClosetStartSteps.getProductBrand());
    }

    @And("I go to Product screen")
    public void iGoToProductScreen() {
        SecretClosetStartSteps.openProductWithDiscount();
    }
}
