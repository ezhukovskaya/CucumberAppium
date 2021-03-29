package framework.elements;

import framework.base.BaseAndroidElement;
import org.openqa.selenium.By;

public class Label extends BaseAndroidElement {
    public Label(By elementLocator, String elementName) {
        super(elementLocator, elementName);
    }
}
