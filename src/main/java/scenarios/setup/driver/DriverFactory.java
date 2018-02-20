package scenarios.setup.driver;

import org.openqa.selenium.WebDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class DriverFactory {
    private static WebDriver driver;
    private static Supplier<WebDriver> driverSupplier;

    public static WebDriver getDriver() {
        if(Objects.isNull(driver)){
            driver = driverSupplier.get();
        }
        return driver;
    }

    public static void setUpDriver(String type) {
        driverSupplier = Drivers.get(type);
    }

    public static void quit() {
        driver.quit();
    }
}
