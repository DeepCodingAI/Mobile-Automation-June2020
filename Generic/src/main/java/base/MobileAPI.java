package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MobileAPI {
    public static AppiumDriver appiumDriver = null;
    public DesiredCapabilities cap = null;
    public static File appDirectory = null;
    public static File findApp = null;

    @Parameters({"OS","appType","deviceType","deviceName","version","moduleName","appName"})
    @BeforeMethod
    public void setUp(String OS,String appType,String deviceType,String deviceName, String version,String moduleName,
                      String appName) throws MalformedURLException {
        if (OS.equalsIgnoreCase("iOS")) {
            if (OS.equalsIgnoreCase("Phone")) {
                if (deviceType.equalsIgnoreCase("realDevice")) {
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    appiumDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                    appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                } else if (deviceType.equalsIgnoreCase("Simulator")) {
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    appiumDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                    appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }


            } else if (OS.equalsIgnoreCase("Tablets")) {
                if (deviceType.equalsIgnoreCase("realDevice")) {
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    appiumDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                    appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                } else if (deviceType.equalsIgnoreCase("Simulator")) {
                    cap = new DesiredCapabilities();
                    cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                    cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                    cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                    appiumDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                    appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }
              }
            } else if (OS.equalsIgnoreCase("Android")) {
                if (appType.equalsIgnoreCase("Phone")) {
                    appDirectory = new File(moduleName + "/src/app");
                    findApp = new File(appDirectory,appName);
                    if (deviceType.equalsIgnoreCase("realDevice")) {
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.APP, findApp.getAbsolutePath());
                        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
                        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    } else if (deviceType.equalsIgnoreCase("Emulator")) {
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
                        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }
                } else if (OS.equalsIgnoreCase("Tablets")) {
                    if (deviceType.equalsIgnoreCase("realDevice")) {
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
                        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    } else if (deviceType.equalsIgnoreCase("Emulator")) {
                        cap = new DesiredCapabilities();
                        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
                        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceType);
                        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
                        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
                        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
                        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }
                }
        }
    }

    @AfterMethod
    public void cleanUpApp(){
        appiumDriver.quit();
    }

    public void clickByXpath(String locator){
        appiumDriver.findElement(By.xpath(locator)).click();
    }
    public void clickByXpathWebElement(WebElement locator){
        locator.click();
    }
    public void sleep(int sec)throws InterruptedException{
        Thread.sleep(1000 * sec);
    }

    public void typeByXpath(String locator, String value, Keys key){
        appiumDriver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typeByXpath(String locator, String value){
        appiumDriver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public List<String> getTexts(List<WebElement> elements){
        List<String> text = new ArrayList<String>();
        for(WebElement element:elements){
            text.add(element.getText());
        }

        return text;
    }
    public static void scrollKeys(AppiumDriver driver, String[] list, String parent) {
        System.out.println("Starting the process");
        for (int i = 0; i < list.length; i++) {
            MobileElement we = (MobileElement) driver.findElementByXPath(parent+"/UIAPickerWheel["+(i+1)+"]");
            we.sendKeys(list[i]);
        }
        System.out.println("Ending Process");
    }
    public void scrollToElement(AppiumDriver driver, String text){
        MobileElement we = (MobileElement) driver.findElementByXPath(text);
        driver.scrollTo(we.getText());
    }
    public void alertAccept(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver,5);
        try{
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }catch (Exception e){
            System.err.println("No alert visible in 5 seconds");
        }
    }
    public void scrollAndClickByName(String locator){
        appiumDriver.scrollTo(locator).click();
    }
}
