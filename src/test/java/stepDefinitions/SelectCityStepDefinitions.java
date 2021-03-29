package stepDefinitions;

import application.windows.pageObject.screens.SelectCityScreen;
import framework.base.BaseSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.SelectCitySteps;

public class SelectCityStepDefinitions {
    @Then("Select city screen is open")
    public void selectCityScreenIsOpen() {
        BaseSteps.verifyIsDisplayed(SelectCityScreen.class);
    }

    @When("I type {string} and click it")
    public void iTypeAndClickIt(String city) {
        SelectCitySteps.selectCity(city);
    }
}
