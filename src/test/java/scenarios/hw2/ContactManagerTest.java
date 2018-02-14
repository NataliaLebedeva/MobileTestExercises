package scenarios.hw2;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import scenarios.pageobject.app.ContactManagerApp;

import java.net.MalformedURLException;

public class ContactManagerTest extends DriverSetup {

    public static final String PACKAGE_NAME = "com.example.android.contactmanager";

    @BeforeClass(description = "Initialisation of driver")
    public void setUp() throws MalformedURLException {
        prepareAndroidNative();
        ContactManagerApp.init(driver);
    }

    @Test(description = "test to click button")
    public void tapButtonTest() {
        driver.findElement(By.id("addContactButton")).click();
        driver.findElement(By.id("contactNameEditText")).sendKeys("hello");
        driver.findElement(By.id("contactSaveButton")).click();
        System.out.println("addContactButton is taped");
    }

    @AfterClass(description = "Quit driver after all test in this class")
    public void tearDown() {
        driver.quit();
    }
}
