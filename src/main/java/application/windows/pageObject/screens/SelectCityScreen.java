package application.windows.pageObject.screens;

import application.windows.pageObject.popUps.PleaseDoNotForgetPopUp;
import framework.base.BaseScreen;
import framework.elements.Button;
import framework.elements.Label;
import framework.elements.TextBox;
import org.openqa.selenium.By;

public class SelectCityScreen extends BaseScreen {
    private static PleaseDoNotForgetPopUp pleaseDoNotForgetPopUp = new PleaseDoNotForgetPopUp();
    private static Label selectCityScreenLabel = new Label(By.id("com.zdv.secretcloset:id/tvTitle"), "Select City");
    private TextBox searchTextBox = new TextBox(By.id("com.zdv.secretcloset:id/etSearchTest"), "Search");
    private Button cityFromTheListButton = new Button(By.id("com.zdv.secretcloset:id/tvCityItemName"), "City");

    public SelectCityScreen() {
        super(selectCityScreenLabel);
    }

    public boolean isDisplayed() {
        pleaseDoNotForgetPopUp.accept();
        return selectCityScreenLabel.getText().equals("Select city");
    }

    public void searchFor(String search) {
        searchTextBox.sendKeys(search);
    }

    public void selectFirst() {
        cityFromTheListButton.click();
    }
}
