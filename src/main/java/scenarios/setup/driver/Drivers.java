package scenarios.setup.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import scenarios.setup.Utils;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Drivers {
    private static HashMap<String, Supplier<WebDriver>> AVAILABLE_DRIVERS = new HashMap<String, Supplier<WebDriver>>() {{
        put("web", () -> {
            WebDriver driver;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("deviceName", "WUJ01KCTA5");
            capabilities.setCapability("browserName", "Chrome");
            driver = new AndroidDriver(Utils.createUrl(), capabilities);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver;
        });
        put("app", () -> {
            WebDriver driver;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("deviceName", "WUJ01KCTA5");
            String path = "C:/Users/Nata/Documents/Projects/epam_training/mobile_testing/MobileTestExercises/src/test/resources/ContactManager.apk";
            capabilities.setCapability("app", path);
            driver = new AndroidDriver(Utils.createUrl(), capabilities);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver;
        });
    }};

    public static WebDriver get(String type) {
        return AVAILABLE_DRIVERS.get(type).get();
    }
}
