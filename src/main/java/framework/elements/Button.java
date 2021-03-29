package framework.elements;

import framework.base.BaseAndroidElement;
import framework.capabilities.ApplicationDriver;
import org.openqa.selenium.By;

public class Button extends BaseAndroidElement {
    public Button(By elementLocator, String elementName) {
        super(elementLocator, elementName);
    }

    public void doubleClick() {
        ApplicationDriver.getActions().doubleClick(ApplicationDriver.getElement(this.elementLocator)).build().perform();
    }
}
