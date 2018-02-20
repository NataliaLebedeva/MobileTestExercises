package scenarios.hw3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import scenarios.pageobject.app.ContactManagerApp;
import scenarios.pageobject.web.IanaSite;
import scenarios.setup.TestProperties;
import scenarios.setup.driver.DriverFactory;

public class BaseTest {
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        DriverFactory.setUpDriver(TestProperties.get().type());
    }

    @BeforeTest(groups = "app")
    public void beforeTestNativeApp() {
        ContactManagerApp.init(DriverFactory.getDriver());
    }

    @BeforeTest(groups = "web")
    public void beforeTestWeb() {
        IanaSite.init(DriverFactory.getDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        DriverFactory.quit();
    }
}
