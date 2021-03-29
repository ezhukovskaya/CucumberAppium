package application.windows.pageObject.screens;

import framework.base.BaseScreen;
import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class SecretClosetStartScreen extends BaseScreen {
    public static Label secretClosetScreenNameLabel = new Label(By.id("com.zdv.secretcloset:id/tvTitle"), "Secret Closet Screen");
    public Button selectCityButton = new Button(By.id("com.zdv.secretcloset:id/tvToolbarCity"), "Select City");
    private Button productButton = new Button(By.id("com.zdv.secretcloset:id/rlBanner"), "Product");
    private Label brandLabel = new Label(By.id("com.zdv.secretcloset:id/tvBrand"), "Brand");
    private Button discountButton = new Button(By.id("com.zdv.secretcloset:id/tvDiscount"), "Discount");

    public SecretClosetStartScreen() {
        super(secretClosetScreenNameLabel);
    }

    public String getProductBrand() {
        return brandLabel.getText();
    }

    public void selectCity() {
        selectCityButton.click();
    }

    public String getCity() {
        return selectCityButton.getText();
    }

    public void goToProductWithDiscountScreen() {
        if (productButton.getChildElement(discountButton.getElementLocator()).isDisplayed()) {
            productButton.click();
        }
    }
}
