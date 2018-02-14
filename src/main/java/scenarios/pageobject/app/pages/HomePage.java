package scenarios.pageobject.app.pages;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import scenarios.pageobject.app.entities.Contact;
import scenarios.pageobject.common.BasePage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HomePage extends BasePage {
    @FindBy(id = "addContactButton")
    public WebElement addContactButton;

    @FindBy(xpath = "//*[contains(@resource-id, 'contactList')]//android.widget.TextView")
    public List<WebElement> contacts;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void checkContact(Contact contact) {
        Set<String> contactNames = new HashSet<>();
        for (int i = 0; i <= 7; i++) {
            contactNames.addAll(contacts.stream().map(WebElement::getText).collect(Collectors.toSet()));
            new TouchAction(driver).press(400, 650).waitAction(Duration.ofMillis(4000)).moveTo(400, 150).release().perform();
        }

        Assert.assertTrue(contactNames.contains(contact.getName()));
    }

    public void openAddContactForm() {
        addContactButton.click();
    }
}
