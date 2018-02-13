package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

class DriverSetup {
    AndroidDriver driver;

    void prepareAndroidNative() throws MalformedURLException, NullPointerException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("deviceName", "WUJ01KCTA5");

//        String path = DriverSetup.class.getClassLoader().getResource("ContactManager.apk").getPath();
//        String path = DriverSetup.class.getResource("/ContactManager.apk").getPath();

        String path = "C:\\Users\\Nata\\Documents\\Projects\\epam_training\\mobile_testing\\MobileTestExercises\\src\\test\\resources\\ContactManager.apk";

        capabilities.setCapability("app", path);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    void prepareAndroidWeb() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("deviceName", "WUJ01KCTA5");

        capabilities.setCapability("browserName", "Chrome");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}