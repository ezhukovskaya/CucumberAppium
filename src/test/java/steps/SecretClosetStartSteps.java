package steps;

import application.windows.pageObject.screens.SecretClosetStartScreen;
import framework.capabilities.ApplicationDriver;
import org.testng.Assert;

public class SecretClosetStartSteps {
    private static SecretClosetStartScreen secretClosetStartScreen = new SecretClosetStartScreen();

    public static void selectCity() {
        secretClosetStartScreen.selectCity();
    }

    public static String getProductBrand() {
        return secretClosetStartScreen.getProductBrand();
    }

    public static void openProductWithDiscount() {
        ApplicationDriver.waitUntilElementPresents(SecretClosetStartScreen.secretClosetScreenNameLabel);
        secretClosetStartScreen.goToProductWithDiscountScreen();
    }

    public static void verifyCity(String expectedCity) {
        ApplicationDriver.waitUntilTextPresents(secretClosetStartScreen.selectCityButton, expectedCity);
        Assert.assertEquals(secretClosetStartScreen.getCity(), expectedCity, "City is not " + expectedCity);
    }
}
