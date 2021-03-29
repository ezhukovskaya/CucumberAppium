package framework.base;

import framework.capabilities.ApplicationDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void SetUp() {
        //ApplicationDriver.installApk("C:\\Users\\K.Zhukouskaya\\IdeaProjects\\Anastas\\src\\test\\resources\\apps\\SecretCloset_v1.05_apkpure.com.apk");
        ApplicationDriver.launch();
    }

    @AfterSuite
    public void TearDown() {
        ApplicationDriver.quit();
    }
}
