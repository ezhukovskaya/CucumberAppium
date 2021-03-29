package steps;

import application.windows.pageObject.screens.SelectCityScreen;

public class SelectCitySteps {
    private static SelectCityScreen selectCityScreen = new SelectCityScreen();

    public static void selectCity(String city){
        selectCityScreen.searchFor(city);
        selectCityScreen.selectFirst();
    }
}
