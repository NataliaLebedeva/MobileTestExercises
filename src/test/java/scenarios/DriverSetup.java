package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

class DriverSetup {
    AndroidDriver driver;

    void prepareNative() throws MalformedURLException, NullPointerException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "emulator-5554");

        String path = DriverSetup.class.getClassLoader().getResource("ContactManager.apk").getPath();

        capabilities.setCapability("app", path);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}