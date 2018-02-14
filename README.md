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

* For executing test for native application:
   ##### mvn clean test -P app
* For executing test for web application:
   ##### mvn clean test -P web,prod
