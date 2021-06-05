package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PageBase {
    private final AppiumDriver driver;
    public JavascriptExecutor Jse;
    @FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    MobileElement Allow1;
    @FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    MobileElement Allow2;
    @FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
    MobileElement Allow3;

    public PageBase(AppiumDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);



    }

    protected  static void ClickButton(MobileElement button)
    {

        button.click();
    }

    WebElement checkElement(AppiumDriver driver, By by) {
        try {
            return driver.findElement(by);
        } catch (NoSuchElementException e) {
            return null;
        }
    }
    public void ScrollDown(AppiumDriver driver, MobileElement element){
//        Dimension dim=driver.manage().window().getSize();
//        int x = dim.getWidth()/2;
//        int y=(int) (dim.getHeight()*0.3);
//        int endY=(int)(dim.getHeight()*0.1);
//        TouchAction t = new TouchAction(driver);
//        t.press(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
//                .moveTo(PointOption.point(x,endY)).release().perform();

        TouchActions action = new TouchActions(driver);
        action.scroll(element,10, 100);
        action.perform();


    }
    public void ThreeAllows()
    {
        ClickButton(Allow1);
        ClickButton(Allow2);
        ClickButton(Allow3);
    }

}
