package stepDefinitions;

import application.windows.pageObject.screens.SecretClosetStartScreen;
import application.windows.pageObject.screens.SelectCityScreen;
import framework.base.BaseSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.SecretClosetStartSteps;
import steps.SelectCitySteps;

public class CucumberSteps {
    @Given("I am on Select City screen")
    public void iOpenSelectCityScreen() {
        SecretClosetStartSteps.selectCity();
    }

    @Then("Select city screen is open")
    public void selectCityScreenIsOpen() {
        BaseSteps.verifyIsDisplayed(SelectCityScreen.class);
    }

    @When("I type {string} and click it")
    public void iTypeAndClickIt(String city) {
        SelectCitySteps.selectCity(city);
    }

    @And("The city is {string}")
    public void theCityIs(String city) {
        SecretClosetStartSteps.verifyCity(city);
    }

    @Given("I am on Start screen")
    public void iAmOnStartScreen() {
        BaseSteps.verifyIsDisplayed(SecretClosetStartScreen.class);
    }
}
