package stepDefinitions;

import application.windows.pageObject.screens.SecretClosetStartScreen;
import framework.base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import steps.SecretClosetStartSteps;

public class StartPageStepDefinitions extends CucumberSteps {
    @Given("I am on Select City screen")
    public void iOpenSelectCityScreen() {
        SecretClosetStartSteps.selectCity();
    }

    @Given("I am on Start screen")
    public void iAmOnStartScreen() {
        BaseSteps.verifyIsDisplayed(SecretClosetStartScreen.class);
    }

    @Then("I get Product brand name")
    public void iGetProductBrandName() {
        productBrandName = SecretClosetStartSteps.getProductBrand();
    }

    @And("I go to Product screen")
    public void iGoToProductScreen() {
        SecretClosetStartSteps.openProductWithDiscount();
    }

    @And("The city is {string}")
    public void theCityIs(String city) {
        SecretClosetStartSteps.verifyCity(city);
    }
}
