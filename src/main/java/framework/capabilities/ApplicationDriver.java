package framework.capabilities;

import framework.base.BaseAndroidElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ApplicationDriver {
    private static AndroidDriver<AndroidElement> driver;

    private static AndroidDriver<AndroidElement> getDriver() {
        if (driver == null) {
            driver = ApplicationDriverFactory.GetDriver();
        }
        return driver;
    }

    public static void launch() {
        getDriver();
    }

    public static void waitUntilTextPresents(BaseAndroidElement element, String text) {
        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.textToBePresentInElementLocated(element.getElementLocator(), text));
    }

    public static void installApk(String apkPath) {
        getDriver().installApp(apkPath);
    }

    public static void quit() {
        getDriver().quit();
    }

    public static TouchActions getActions() {
        return new TouchActions(getDriver());
    }

    public static AndroidElement getElement(By by) {
        return getDriver().findElement(by);
    }

    public static List<AndroidElement> getElements(By by) {
        return getDriver().findElements(by);
    }
}
