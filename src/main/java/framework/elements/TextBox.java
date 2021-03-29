package framework.elements;

import framework.base.BaseAndroidElement;
import framework.capabilities.ApplicationDriver;
import org.openqa.selenium.By;

public class TextBox extends BaseAndroidElement {
    public TextBox(By elementLocator, String elementName) {
        super(elementLocator, elementName);
    }

    public void sendKeys(CharSequence... charSequences) {
        ApplicationDriver.getElement(this.elementLocator).sendKeys(charSequences);
    }
}
