package Pages;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ChatPage extends PageBase {
    public ChatPage(AppiumDriver driver)
    {
        super(driver);
    }
    @FindBy(id="com.humansoftsolution.ugu.debug:id/actionSearch")
    MobileElement searchIcon;
    @FindBy(id="com.humansoftsolution.ugu.debug:id/et_search")
    MobileElement searchTxt;
    public void PrivateChat(AppiumDriver driver)
    {
        MobileElement chatBtn= (MobileElement) driver.findElementsByAccessibilityId("Chat");
        chatBtn.click();
        ClickButton(searchIcon);
        searchTxt.sendKeys("nermeen");
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        MobileElement TheUser= (MobileElement) driver.findElements(By.id("com.humansoftsolution.ugu.staging:id/search_user_container")).get(0);
        TheUser.click();
    }

}
