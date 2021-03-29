package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import steps.ProductSteps;

public class ProductStepDefinitions extends CucumberSteps {
    @And("I confirm Discount Price")
    public void iConfirmDiscountPrice() {
        ProductSteps.verifyCurrentPriceIsCorrect();
    }

    @Then("I confirm Product name")
    public void iConfirmProductName() {
        ProductSteps.verifyBrand(productBrandName);
    }
}
