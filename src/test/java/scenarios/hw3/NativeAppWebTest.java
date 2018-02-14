package scenarios.hw3;

import org.testng.annotations.Test;
import scenarios.pageobject.app.ContactManagerApp;
import scenarios.pageobject.app.entities.Contact;
import scenarios.pageobject.web.IanaSite;

public class NativeAppWebTest extends BaseTest {

    @Test(groups = "web", description = "Open home page test.")
    public void webTest() {
        IanaSite.homePage.open();
        IanaSite.homePage.checkIsOpened();
    }

    @Test(groups = "app", description = "Adding contact via PageObject pattern.")
    public void appTest() {
        ContactManagerApp.homePage.openAddContactForm();
        ContactManagerApp.addContactPage.addContact(Contact.getContact());
        ContactManagerApp.homePage.checkContact(Contact.getContact());
    }
}
