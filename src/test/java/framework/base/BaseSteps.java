package framework.base;

import framework.capabilities.ApplicationDriver;
import org.testng.Assert;

import java.lang.reflect.InvocationTargetException;

public class BaseSteps {

    private static <T extends BaseScreen> T getScreen(Class<T> clazz) {
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }

    public static <T extends BaseScreen> void verifyIsDisplayed(Class<T> clazz) {
        Assert.assertTrue(getScreen(clazz).isDisplayed(), "Screen " + getScreen(clazz).getName() + " is not displayed");
    }
}
