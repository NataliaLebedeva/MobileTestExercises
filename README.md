# MobileTestAutoWinter2018

## Home work 2
1. The main idea of locators is that it should be unique for searching object.
The difference is in methods, used to find element "By.method("locator")".

2. Appium server should contain set of capabilities, where "deviceName" should contains device ID
(serial number), that is shown by command "adb devices". In DriverSetup the capability "deviceName" should be
also changed to the device ID (serial number).

3. The first run of test takes more time, then the following.

4.
   * The existing code is not a test as it is, there is no "Assert" - methods.
   * Too many "hard code"-values.
   * Thread.sleep in "webTest".
   * Absolute path to app.
   * The structure of classes is not optimal.
   
## Home work 3

* For executing test for native application on emulator:
   ##### mvn clean test -P app,emu
* For executing test for web application on emulator:
   ##### mvn clean test -P web,prod,emu
* For executing test for native application on device:
   ##### mvn clean test -P app,sony
* For executing test for web application on device:
   ##### mvn clean test -P web,prod,sony
   
1. Instance of driver is now unique for application test. For testing web the new instance of driver will be created.
This solution won't work in parallel. To solve it, this code can be improved by using special library, or by using
`ThreadLocal<WebDriver>`.

2. I used library to pass property from Maven `<profile>` to java-code.
The main purpose of this decision is to avoid issues in my current realisation.
The less code - the less chance to get a mistake.

5. From my point of view, to check URL or title or one unique element of HomePage is quite enough to assert,
that the page is opened.  