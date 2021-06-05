package Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestBase {
    public static AndroidDriver<MobileElement> driver;

@BeforeTest(alwaysRun = true)
@Parameters({"udid","systemPort","platform"})
public void setup( String udid , String systemPort, String platformVersion) throws MalformedURLException {

    //URL url = new URL(driver.getCurrentUrl());
   //String[] platformInfo=platform.split("");
    DesiredCapabilities Caps = new DesiredCapabilities();
    Caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
    Caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    Caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
    Caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
    Caps.setCapability(MobileCapabilityType.UDID, udid);
    Caps.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT, systemPort);
    Caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Nermeen Elrays\\Downloads\\ugu-v1.1.8-787-debug.apk");
    Caps.setCapability(MobileCapabilityType.ORIENTATION,"PORTRAIT");
    //Caps.setCapability(MobileCapabilityType.NO_RESET,false);
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), Caps);
    //driver = new AndroidDriver<MobileElement>(url, Caps);
}
@AfterTest(alwaysRun = true)
public void tearDown() {
    if (driver != null) {
        // driver.quit();
    }
}
//}
//    @BeforeSuite
//    public void SetAppium() {
//        DesiredCapabilities Caps= new DesiredCapabilities();
//        Caps.setCapability("platformName","Android");
//        Caps.setCapability("platformVersion","11");
//        Caps.setCapability("deviceName","emulator-5554");





//        Caps.setCapability("app","C:\\Users\\Nermeen Elrays\\Downloads\\app\\ugu-v0.7.1-0-staging (1).apk");
//
//        //Caps.setCapability("appPackage","com.android.mms");
//        //Caps.setCapability("appActivity","com.android.mms.ui.MessageFullScreenActivity");
//        try {
//            driver= new AndroidDriver<>(new URL("http://127.0.0.1:4727/wd/hub/"), Caps);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Execute the First device (android 11)");
//        DesiredCapabilities Caps = new DesiredCapabilities();
//        Caps.setCapability("platformName", "Android");
//        Caps.setCapability("platformVersion", "11");
//        Caps.setCapability("deviceName", "emulator-5554");
//        Caps.setCapability("app", "C:\\Users\\Nermeen Elrays\\Downloads\\app\\ugu-v0.7.1-0-staging (1).apk");
//
//        try {
//            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4725/wd/hub/"), Caps);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

//        System.out.println("Execute the second device (android 10)");
//        DesiredCapabilities Caps1 = new DesiredCapabilities();
//        Caps1.setCapability("platformName", "Android");
//        Caps1.setCapability("platformVersion", "10");
//        Caps1.setCapability("deviceName", "emulator-5556");
//        Caps1.setCapability("app", "C:\\Users\\Nermeen Elrays\\Downloads\\app\\ugu-v0.7.1-0-staging (1).apk");
//        try {
//            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4726/wd/hub/"), Caps1);
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @AfterSuite
//    public void TearDown() {
//        driver.resetApp();
//        driver.quit();
//    }


}