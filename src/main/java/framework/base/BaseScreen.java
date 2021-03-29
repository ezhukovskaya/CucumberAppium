package framework.base;

import framework.capabilities.ApplicationDriver;
import org.openqa.selenium.By;

public abstract class BaseScreen {
    private final By locator;
    private final String name;

    protected BaseScreen(BaseAndroidElement element) {
        this.locator = element.elementLocator;
        this.name = element.elementName;
    }

    public By getLocator(){
        return locator;
    }

    public String getName(){
        return name;
    }

    public boolean isDisplayed() {
        return ApplicationDriver.getElements(locator).size() > 0;
    }
}
