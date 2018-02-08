package scenarios.pageobject;

import org.openqa.selenium.WebDriver;
import scenarios.pageobject.pages.AddContactPage;
import scenarios.pageobject.pages.HomePage;

public class ContactManagerApp {

    public static AddContactPage addContactPage;
    public static HomePage homePage;

    public static void init(WebDriver driver) {
        addContactPage = new AddContactPage(driver);
        homePage = new HomePage(driver);
    }
}
