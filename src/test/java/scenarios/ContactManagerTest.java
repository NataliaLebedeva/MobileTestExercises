package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import scenarios.pageobject.ContactManagerApp;
import scenarios.pageobject.entities.Contact;

import java.net.MalformedURLException;

public class ContactManagerTest extends DriverSetup {

    public static final String PACKAGE_NAME = "com.example.android.contactmanager";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        prepareNative();
        ContactManagerApp.init(driver);
    }

    @Test
    public void addContactTest() {
        ContactManagerApp.homePage.addContactButton.click();
        ContactManagerApp.addContactPage.addContact(Contact.CONTACT_NATA);
    }

    @Test
    public void tapButtonTest() {
        driver.findElement(By.id("addContactButton")).click();
        driver.findElement(By.id("contactNameEditText")).sendKeys("hello");
        driver.findElement(By.id("contactSaveButton")).click();
        System.out.println("addContactButton is taped");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
