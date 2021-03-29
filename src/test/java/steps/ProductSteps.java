package steps;

import application.windows.pageObject.screens.ProductScreen;
import framework.utils.StringUtils;
import org.testng.Assert;

public class ProductSteps {
    private static ProductScreen productScreen = new ProductScreen();

    public static void verifyBrand(String brandName) {
        Assert.assertEquals(productScreen.getBrand(), brandName, "Brand is not " + brandName);
    }

    public static void verifyCurrentPriceIsCorrect() {
        double currentPrice = StringUtils.toDouble(productScreen.getCurrentPrice());
        double originalPrice = StringUtils.toDouble(productScreen.getOriginalPrice());
        double discount = StringUtils.toDouble(productScreen.getDiscount());
        double expectedCurrentPrice = originalPrice - originalPrice * discount / 100;
        Assert.assertEquals(currentPrice, expectedCurrentPrice, "Current Price is not " + expectedCurrentPrice);
    }
}
