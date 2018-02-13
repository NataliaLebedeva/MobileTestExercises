package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import scenarios.pageobject.ContactManagerApp;

import java.net.MalformedURLException;

public class ContactManagerTest extends DriverSetup {

    public static final String PACKAGE_NAME = "com.example.android.contactmanager";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        prepareAndroidNative();
//        prepareAndroidWeb();
        ContactManagerApp.init(driver);
    }

//    @Test
//    public void addContactTest() {
//        ContactManagerApp.homePage.addContactButton.click();
//        ContactManagerApp.addContactPage.addContact(Contact.CONTACT_NATA);
//    }

    @Test
    public void tapButtonTest() {
        driver.findElement(By.id("addContactButton")).click();
        driver.findElement(By.id("contactNameEditText")).sendKeys("hello");
        driver.findElement(By.id("contactSaveButton")).click();
        System.out.println("addContactButton is taped");
    }

//    @Test(description = "Open website")
//    public void webTest() throws InterruptedException {
//        driver.get("http://iana.org");
//        Thread.sleep(5000);
//        System.out.println("Site opening done");
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
