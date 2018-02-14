package scenarios.setup.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver(String type) {
        driver = Drivers.get(type);
    }

    public static void quite() {
        driver.quit();
    }
}
