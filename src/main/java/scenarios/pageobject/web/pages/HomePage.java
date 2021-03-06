package scenarios.pageobject.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import scenarios.pageobject.common.BasePage;
import scenarios.pageobject.web.enums.HomePageData;
import scenarios.setup.TestProperties;

public class HomePage extends BasePage {
    @FindBy(id = "intro")
    public WebElement intro;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(TestProperties.get().domain());
    }

    public void checkIsOpened() {
        Assert.assertEquals(intro.getText(), HomePageData.INTRO.toString());
    }
}
