package framework.base;

import framework.capabilities.ApplicationDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseAndroidElement {
    private static final Logger log = Logger.getLogger(BaseAndroidElement.class);
    protected By elementLocator;
    protected String elementName;

    protected BaseAndroidElement(By elementLocator, String elementName) {
        this.elementLocator = elementLocator;
        this.elementName = elementName;
    }
    public By getElementLocator(){
        return elementLocator;
    }

    public AndroidElement getElement(){
        return ApplicationDriver.getElement(elementLocator);
    }

    public void click() {
        log.info(elementName + " click");
        getElement().click();
    }

    public AndroidElement getChildElement(By by){
        return (AndroidElement) getElement().findElement(by);
    }


    public String getText() {
        log.info("Get text from element " + elementName);
        return getElement().getText();
    }

    public boolean isDisplayed() {
        return ApplicationDriver.getElements(elementLocator).size() > 0;
    }
}
