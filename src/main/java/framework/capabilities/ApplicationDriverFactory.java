package framework.capabilities;

import framework.constants.FileNames;
import framework.models.DriverSettingsModel;
import framework.utils.JsonUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationDriverFactory {
    //private static final DriverSettingsModel model = JsonUtils.ToObject(FileNames.DRIVER_SETTINGS);

    private static DesiredCapabilities GetDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appActivity", "com.zdv.secretcloset.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","Nexus_5X_API_30");
        capabilities.setCapability("appPackage", "com.zdv.secretcloset");
        capabilities.setCapability("name", "SecretCloset");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformVersion", "11.0");
        return capabilities;
    }

    public static AndroidDriver<AndroidElement> GetDriver() {
        try {
            return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), GetDesiredCapabilities());
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
