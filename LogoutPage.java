package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LogoutPage extends PageBase {
    public LogoutPage(AppiumDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @FindBy(id="com.humansoftsolution.ugu.debug:id/action_settings")
    MobileElement Settings;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[6]/android.view.ViewGroup")
    MobileElement accountManagement;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/tv_account_logout")
    MobileElement logout;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/btn_positive")
    MobileElement ConfirmLogout;
    @FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    MobileElement EmailTxt;
    public void GoToProfile(AppiumDriver driver) throws InterruptedException {
        Thread.sleep(500);
        MobileElement profile= (MobileElement) driver.findElement(new MobileBy.ByAccessibilityId("Image Description"));
        ClickButton(profile);
    }
    public void UserCanLogOut(AppiumDriver driver) throws InterruptedException {

        ClickButton(Settings);
//        MobileElement index = (MobileElement) driver.findElementsById("com.humansoftsolution.ugu.staging:id/main_settings_item_container").get(6);
//        index.click();
//        AndroidElement list=(AndroidElement)driver.findElement(By.id("com.humansoftsolution.ugu.staging:id/main_settings_item_container"));
        MobileElement listItem=(MobileElement)driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("+"new UiSelector().textContains(\"Account management\").instance(0))"));
        listItem.click();
       // ClickButton(accountManagement);
        ClickButton(logout);
        ClickButton(ConfirmLogout);
        Assert.assertTrue(true, String.valueOf(EmailTxt.isDisplayed()));
    }
}
