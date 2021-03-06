package scenarios.pageobject.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected AppiumDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = (AppiumDriver) driver;
        PageFactory.initElements(driver, this);
    }
}
