package scenarios.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "addContactButton")
    public WebElement addContactButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
