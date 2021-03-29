package tests;

import application.windows.pageObject.screens.SecretClosetStartScreen;
import application.windows.pageObject.screens.SelectCityScreen;
import framework.base.BaseSteps;
import framework.base.BaseTest;
import org.testng.annotations.Test;
import steps.ProductSteps;
import steps.SecretClosetStartSteps;
import steps.SelectCitySteps;


public class CityChangeTest extends BaseTest {
    @Test
    public void cityChangeTest(){
        BaseSteps.verifyIsDisplayed(SecretClosetStartScreen.class);
        SecretClosetStartSteps.selectCity();
        BaseSteps.verifyIsDisplayed(SelectCityScreen.class);
        SelectCitySteps.selectCity("Dubai");
        SecretClosetStartSteps.verifyCity("Dubai");
        String productBrand = SecretClosetStartSteps.getProductBrand();
        SecretClosetStartSteps.openProductWithDiscount();
        ProductSteps.verifyBrand(productBrand);
        ProductSteps.verifyCurrentPriceIsCorrect();
    }
}
