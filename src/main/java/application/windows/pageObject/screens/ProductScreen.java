package application.windows.pageObject.screens;

import framework.base.BaseScreen;
import framework.elements.Button;
import framework.elements.Label;
import org.openqa.selenium.By;

public class ProductScreen extends BaseScreen {
    private static Label brandNameLabel = new Label(By.id("com.zdv.secretcloset:id/tvItemBrand"), "Brand Name");
    private Label originalPriceLabel = new Label(By.id("com.zdv.secretcloset:id/tvItemOriginalPrice"), "Original Price");
    private Label currentPriceLabel = new Label(By.id("com.zdv.secretcloset:id/tvItemPrice"), "Current Price");
    private Label discountLabel = new Label(By.id("com.zdv.secretcloset:id/tvItemDiscount"), "Discount");

    public ProductScreen(){
        super(brandNameLabel);
    }

    public String getBrand(){
        return brandNameLabel.getText();
    }

    public String getOriginalPrice(){
        return originalPriceLabel.getText();
    }

    public String getCurrentPrice(){
        return currentPriceLabel.getText();
    }

    public String getDiscount(){
        return discountLabel.getText();
    }
}
